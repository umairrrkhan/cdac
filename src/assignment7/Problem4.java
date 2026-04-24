package assignment7;

public class Problem4 {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtEnd(10);
        dll.insertAtEnd(20);
        dll.insertAtBeginning(5);
        dll.insertAtPosition(15, 3);
        dll.displayForward();
        dll.displayBackward();
        dll.deleteNode(20);
        dll.displayForward();
    }
}

class DNode {
    int data;
    DNode prev;
    DNode next;
    
    DNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    private DNode head;
    
    void insertAtBeginning(int data) {
        DNode newNode = new DNode(data);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }
    
    void insertAtEnd(int data) {
        DNode newNode = new DNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        DNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }
    
    void insertAtPosition(int data, int position) {
        DNode newNode = new DNode(data);
        if (position == 1) {
            insertAtBeginning(data);
            return;
        }
        
        DNode temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        
        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }
        
        newNode.next = temp.next;
        newNode.prev = temp;
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
    }
    
    void deleteNode(int key) {
        DNode temp = head;
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }
        
        if (temp == null) {
            System.out.println("Node not found");
            return;
        }
        
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        } else {
            head = temp.next;
        }
        
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
    }
    
    void displayForward() {
        DNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    void displayBackward() {
        if (head == null) return;
        DNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }
}