package assignment7;

public class Problem8 {
    public static void main(String[] args) {
        QueueFull queue = new QueueFull(3);
        System.out.println("Is queue full? " + queue.isFull());
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Is queue full? " + queue.isFull());
        queue.enqueue(40);
    }
}

class QueueFull {
    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;
    
    QueueFull(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
    
    void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = data;
        size++;
        System.out.println(data + " enqueued");
    }
    
    boolean isFull() {
        return size == capacity;
    }
}