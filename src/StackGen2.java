import java.util.Scanner;
public class StackGen2 {
    public static void main(String[] args) {

        StackGen<String> stack = new StackGen<>(25);
        String input = "f(x)=(2x+y)-(3+(2x-x)+20)";
        Scanner stck = new Scanner(input);

        stck.useDelimiter("");

        for (int p = 0; p < 25; p++) {
            String Pabs = stck.next();
            if (Pabs.equals("(")) {
                stack.push("(");
            } else if (Pabs.equals(")")){
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            System.out.println("valid");
        } else {
            System.out.println("tidak valid");
        }
    
    }
}
