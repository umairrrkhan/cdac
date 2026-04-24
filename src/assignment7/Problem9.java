package assignment7;

public class Problem9 {
    public static void main(String[] args) {
        QueueEmpty queue = new QueueEmpty(5);
        System.out.println("Is queue empty? " + queue.isEmpty());
        queue.enqueue(10);
        System.out.println("Is queue empty? " + queue.isEmpty());
        queue.dequeue();
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}

class QueueEmpty {
    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;
    
    QueueEmpty(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
    
    void enqueue(int data) {
        if (size == capacity) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = data;
        size++;
    }
    
    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int data = arr[front];
        front = (front + 1) % capacity;
        size--;
        return data;
    }
    
    boolean isEmpty() {
        return size == 0;
    }
}