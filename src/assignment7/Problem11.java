package assignment7;

public class Problem11 {
    public static void main(String[] args) {
        CircularQueueEmpty cq = new CircularQueueEmpty(5);
        System.out.println("Is circular queue empty? " + cq.isEmpty());
        cq.enqueue(10);
        System.out.println("Is circular queue empty? " + cq.isEmpty());
        cq.dequeue();
        System.out.println("Is circular queue empty? " + cq.isEmpty());
    }
}

class CircularQueueEmpty {
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;
    
    CircularQueueEmpty(int size) {
        capacity = size;
        arr = new int[capacity];
        front = -1;
        rear = -1;
    }
    
    void enqueue(int data) {
        if ((rear + 1) % capacity == front) {
            System.out.println("Circular Queue is full");
            return;
        }
        if (front == -1) front = 0;
        rear = (rear + 1) % capacity;
        arr[rear] = data;
    }
    
    int dequeue() {
        if (isEmpty()) {
            System.out.println("Circular Queue is empty");
            return -1;
        }
        int data = arr[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        return data;
    }
    
    boolean isEmpty() {
        return front == -1;
    }
}