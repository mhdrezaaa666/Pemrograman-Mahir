import java.util.*;

public class Tugas4 {

   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan Rumus Aljabar = ");
    String inputan = input.nextLine();
    
    String checkBalancedExpr1=cekValid(inputan);
    System.out.println(" Rumus = "+inputan);
    System.out.println(" Keterangan = "+checkBalancedExpr1);
}

public static String cekValid(String inputan)
{
   if (inputan.isEmpty())
       return "Valid";

   Stack<Character> stack = new Stack<Character>();
   for (int i = 0; i < inputan.length(); i++)
   {
       char current = inputan.charAt(i);
       if (current == '(')
       {
           stack.push(current);
       }
       if (current == ')')
       {
           if (stack.isEmpty())
               return "Tidak Valid";
           char last = stack.peek();
           if (current == ')' && last == '(')
               stack.pop();
           else 
               return "Tidak Valid";
       }
   }
   return stack.isEmpty()?"Valid":"Tidak Valid";
}

}