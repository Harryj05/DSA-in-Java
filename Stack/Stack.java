public class Stack {

    private int[] arr = new int[5];
    int top;
    int size;

    public Stack() {
        size = arr.length;
        top = -1;
    }

    public void push(int data) {
        if (top < size - 1) {
            arr[++top] = data;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    public int pop() {
        if (top > -1) {
            return arr[top--];
        } else {
            System.out.println("Stack Underflow");
            return -1; // return a default or error value
        }
    }

    public int peek() {
        if (top > -1) {
            return arr[top];
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public void printStack() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("Stack elements (top to bottom): ");
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // For testing
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.printStack();  // should print 30 20 10

        System.out.println("Popped: " + s.pop()); // should print 30
        s.printStack();

        System.out.println("Top element: " + s.peek()); // should print 20

        s.pop();
        s.pop();
        s.pop(); // should show underflow
    }
}
 