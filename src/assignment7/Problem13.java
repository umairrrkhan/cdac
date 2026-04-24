package assignment7;

public class Problem13 {
    public static void main(String[] args) {
        FlexibleQueue queue = new FlexibleQueue();
        queue.insertLast(20);
        queue.insertLast(30);
        queue.display();
        queue.insertFirst(10);
        queue.display();
        queue.insertAtPosition(25, 2);
        queue.display();
        System.out.println("Removed: " + queue.removeFront());
        queue.display();
    }
}

class FlexibleQueue {
    private java.util.LinkedList<Integer> list;
    
    FlexibleQueue() {
        list = new java.util.LinkedList<>();
    }
    
    void insertFirst(int data) {
        list.addFirst(data);
        System.out.println(data + " inserted at beginning");
    }
    
    void insertLast(int data) {
        list.addLast(data);
        System.out.println(data + " inserted at end");
    }
    
    void insertAtPosition(int data, int position) {
        if (position < 0 || position > list.size()) {
            System.out.println("Invalid position");
            return;
        }
        list.add(position, data);
        System.out.println(data + " inserted at position " + position);
    }
    
    int removeFront() {
        if (list.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return list.removeFirst();
    }
    
    void display() {
        System.out.println("Queue: " + list);
    }
}