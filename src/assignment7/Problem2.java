package assignment7;

public class Problem2 {
    public static void main(String[] args) {
        QueueLinkedList queue = new QueueLinkedList();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();
        System.out.println("Dequeued: " + queue.dequeue());
        queue.display();
    }
}

class QueueNode {
    int data;
    QueueNode next;
    
    QueueNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class QueueLinkedList {
    private QueueNode front;
    private QueueNode rear;
    
    QueueLinkedList() {
        front = null;
        rear = null;
    }
    
    void enqueue(int data) {
        QueueNode newNode = new QueueNode(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println(data + " enqueued to queue");
    }
    
    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return data;
    }
    
    boolean isEmpty() {
        return front == null;
    }
    
    void display() {
        QueueNode temp = front;
        while (temp != null) {
            System.out.print(temp.data + " <- ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}