package assignment7;

public class Problem10 {
    public static void main(String[] args) {
        CircularQueueFull cq = new CircularQueueFull(3);
        System.out.println("Is circular queue full? " + cq.isFull());
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        System.out.println("Is circular queue full? " + cq.isFull());
        cq.enqueue(40);
    }
}

class CircularQueueFull {
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;
    
    CircularQueueFull(int size) {
        capacity = size;
        arr = new int[capacity];
        front = -1;
        rear = -1;
    }
    
    void enqueue(int data) {
        if (isFull()) {
            System.out.println("Circular Queue is full");
            return;
        }
        if (front == -1) front = 0;
        rear = (rear + 1) % capacity;
        arr[rear] = data;
        System.out.println(data + " enqueued");
    }
    
    boolean isFull() {
        return (rear + 1) % capacity == front;
    }
}