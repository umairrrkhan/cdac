package assignment7;

public class Problem5 {
    public static void main(String[] args) {
        StackOps stack = new StackOps(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
    }
}

class StackOps {
    private int[] arr;
    private int top;
    private int capacity;
    
    StackOps(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }
    
    void push(int data) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = data;
        System.out.println(data + " pushed to stack");
    }
    
    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }
}