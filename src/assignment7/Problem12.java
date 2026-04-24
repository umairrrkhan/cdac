package assignment7;

public class Problem12 {
    public static void main(String[] args) {
        CircularQueueArrayImpl cq = new CircularQueueArrayImpl(5);
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);
        cq.display();
        System.out.println("Dequeued: " + cq.dequeue());
        cq.display();
        cq.enqueue(60);
        cq.display();
    }
}

class CircularQueueArrayImpl {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;
    
    CircularQueueArrayImpl(int size) {
        capacity = size;
        queue = new int[capacity];
        front = -1;
        rear = -1;
    }
    
    void enqueue(int data) {
        if ((rear + 1) % capacity == front) {
            System.out.println("Circular Queue is full");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = data;
        System.out.println(data + " inserted");
    }
    
    int dequeue() {
        if (front == -1) {
            System.out.println("Circular Queue is empty");
            return -1;
        }
        int data = queue[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        return data;
    }
    
    void display() {
        if (front == -1) {
            System.out.println("Circular Queue is empty");
            return;
        }
        System.out.print("Elements: ");
        if (rear >= front) {
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
        } else {
            for (int i = front; i < capacity; i++) {
                System.out.print(queue[i] + " ");
            }
            for (int i = 0; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
        }
        System.out.println();
    }
}