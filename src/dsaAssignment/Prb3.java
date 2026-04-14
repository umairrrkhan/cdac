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

class CircularDoublyLinkedList {
    Node head;
    
    void insert(int data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
            newNode.next = head;
            newNode.prev = head;
            return;
        }
        
        Node last = head.prev;
        
        last.next = newNode;
        newNode.prev = last;
        newNode.next = head;
        head.prev = newNode;
    }
    
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
            newNode.next = head;
            newNode.prev = head;
            return;
        }
        
        Node last = head.prev;
        
        newNode.next = head;
        newNode.prev = last;
        head.prev = newNode;
        last.next = newNode;
        head = newNode;
    }
    
    void delete(int key) {
        if (head == null) return;
        
        Node temp = head;
        
        do {
            if (temp.data == key) {
                if (temp.next == temp) {  
                    head = null;
                    return;
                }
                
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
                
                if (temp == head) {
                    head = temp.next;
                }
                return;
            }
            temp = temp.next;
        } while (temp != head);
    }
    
    void displayForward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        
        Node temp = head;
        do {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }
    
    void displayBackward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        
        Node temp = head.prev;
        do {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        } while (temp != head.prev);
        System.out.println("(back to tail)");
    }
}



public class Prb3 {
	public static void main(String[] args) {
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();
        
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
