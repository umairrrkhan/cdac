package dsaAssignment;

class Node {
    int data;
    Node next;
    Node prev;
    
    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    Node head;
    
    void insert(int data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
            return;
        }
        
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        
        temp.next = newNode;
        newNode.prev = temp;
    }
    
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
            return;
        }
        
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    
    void delete(int key) {
        if (head == null) return;
        
        if (head.data == key) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }
        
        Node temp = head;
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }
        
        if (temp == null) return;
        
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
    }
    
    void displayForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    void displayBackward() {
        if (head == null) return;
        
        Node temp = head;
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

public class Prb4 {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        
        list.insert(10);
        list.insert(20);
        list.insert(30);
        
        System.out.print("Forward:  ");
        list.displayForward();   
        
        System.out.print("Backward: ");
        list.displayBackward();  
        
        list.insertAtBeginning(5);
        System.out.print("After insertAtBeginning: ");
        list.displayForward();   
        
        list.delete(20);
        System.out.print("After delete(20): ");
        list.displayForward();   
    }
}



