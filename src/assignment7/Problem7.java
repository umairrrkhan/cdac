package assignment7;

public class Problem7 {
    public static void main(String[] args) {
        StackEmpty stack = new StackEmpty(5);
        System.out.println("Is stack empty? " + stack.isEmpty());
        stack.push(10);
        System.out.println("Is stack empty? " + stack.isEmpty());
        stack.pop();
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}

class StackEmpty {
    private int[] arr;
    private int top;
    private int capacity;
    
    StackEmpty(int size) {
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
    }
    
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }
    
    boolean isEmpty() {
        return top == -1;
    }
}