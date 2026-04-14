package dsaAssignment;

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SortedLinkedList {
    Node head;
    
    void insert(int data) {
        Node newNode = new Node(data);
        
        if (head == null || head.data >= data) {
            newNode.next = head;
            head = newNode;
            return;
        }
        
        Node temp = head;
        while (temp.next != null && temp.next.data < data) {
            temp = temp.next;
        }
        
        newNode.next = temp.next;
        temp.next = newNode;
    }
    
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class Prb5 {
    public static void main(String[] args) {
        SortedLinkedList list = new SortedLinkedList();
        
        list.insert(30);
        list.insert(10);
        list.insert(50);
        list.insert(20);
        list.insert(40);
        
        System.out.print("Sorted list: ");
        list.display();  // 10 -> 20 -> 30 -> 40 -> 50 -> null
    }
}
