package assignment7;

public class Problem6 {
    public static void main(String[] args) {
        StackFull stack = new StackFull(3);
        System.out.println("Is stack full? " + stack.isFull());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Is stack full? " + stack.isFull());
        stack.push(40);
    }
}

class StackFull {
    private int[] arr;
    private int top;
    private int capacity;
    
    StackFull(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }
    
    void push(int data) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = data;
        System.out.println(data + " pushed");
    }
    
    boolean isFull() {
        return top == capacity - 1;
    }
}