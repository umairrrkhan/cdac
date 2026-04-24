package assignment7;

public class Problem3 {
    public static void main(String[] args) {
        CircularQueueLinkedList cq = new CircularQueueLinkedList();
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.display();
        System.out.println("Dequeued: " + cq.dequeue());
        cq.display();
    }
}

class CQNode {
    int data;
    CQNode next;
    
    CQNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularQueueLinkedList {
    private CQNode front;
    private CQNode rear;
    
    CircularQueueLinkedList() {
        front = null;
        rear = null;
    }
    
    void enqueue(int data) {
        CQNode newNode = new CQNode(data);
        if (front == null) {
            front = rear = newNode;
            rear.next = front;
        } else {
            rear.next = newNode;
            rear = newNode;
            rear.next = front;
        }
        System.out.println(data + " enqueued to circular queue");
    }
    
    int dequeue() {
        if (isEmpty()) {
            System.out.println("Circular Queue is empty");
            return -1;
        }
        int data;
        if (front == rear) {
            data = front.data;
            front = rear = null;
        } else {
            data = front.data;
            front = front.next;
            rear.next = front;
        }
        return data;
    }
    
    boolean isEmpty() {
        return front == null;
    }
    
    void display() {
        if (isEmpty()) return;
        CQNode temp = front;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != front);
        System.out.println("(back to front)");
    }
}