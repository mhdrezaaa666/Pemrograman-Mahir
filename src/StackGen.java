public class StackGen<P> {
    public P[] data;
    public int top = 0;

    public StackGen(int n) {
        data = (P[]) new Object[n];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public boolean isFull() {
        return top == data.length;
    }

    public void push(P value) {
        if ( !isFull() ) {
            data[top] = value;
            top = top + 1;
        } else {
            System.out.println("Stack penuh!");
        }
    }

    public P pop() {
        if ( !isEmpty() ) {
            top = top - 1;
            P r = data[top];
            return r;
        } else {
            return null;
        }
    }
    public P peek() {
        if ( !isEmpty() ) {
            return data[top - 1];
        } else {
            return null;
        }
    }
}
