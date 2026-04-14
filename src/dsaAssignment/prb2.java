package dsaAssignment;

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
        
    }
}

class CircularLinkedList {
    Node head;
    
    void insert(int data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
            newNode.next = head;  
            return;
        }
        
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        
        temp.next = newNode;
        newNode.next = head;
    }
    
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }
        
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        
        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }
    
     void delete(int key) {
        if (head == null) return;
        
        if (head.data == key) {
            if (head.next == head) {
                head = null;
                return;
            }
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            head = head.next;
            temp.next = head;
            return;
        }
        
        Node temp = head;
        while (temp.next != head && temp.next.data != key) {
            temp = temp.next;
        }
        
        if (temp.next != head) {
            temp.next = temp.next.next;
        }
    }
    
    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        
        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }
}


public class prb2 {
	 public static void main(String[] args) {
	        CircularLinkedList list = new CircularLinkedList();
	        
	        list.insert(10);
	        list.insert(20);
	        list.insert(30);
	        System.out.print("After insert: ");
	        list.display();  
	        list.insertAtBeginning(5);
	        System.out.print("After insertAtBeginning: ");
	        list.display();  
	        list.delete(20);
	        System.out.print("After delete(20): ");
	        list.display();  
	        }

}
