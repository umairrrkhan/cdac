package dsaAssignment;

class Node {
	int data;
	Node next;
	
	Node(int data){
		this.data = data;  // till here is the implement 
		this.next = null;
	}
}


class LinkedList{
	Node head;
	
	void insertAtbeginning(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	void insertAtend(int data) {
		Node newNode = new Node(data) ;
		if( head == null) {
			head = newNode;
			return;
		}
		
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}
	
	void insertAtPosition(int data , int position) {
		if(position < 0) {
			System.out.println("invalid  position");
		}
		
		if( position == 0) {
			insertAtbeginning(data);
			return;
		}
		Node newNode = new Node(data);
        Node temp = head;
        
        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        
        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
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
	
	void deleteFromBeginning() {
		if(head == null) {
			System.out.println("empty");
			return;
		}
		head = head.next;
	}
	
	void concatenate(LinkedList list2) {
		if( head == null) {
			head = list2.head;
			return;
		}
		if(list2.head == null) {
			return ;
		}
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = list2.head;
	}
	
	void reverse() {
		Node prev = null;
		Node current = head;
		Node next = null ;
		while(current!= null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}
	
	void deleteAtposition(int position) {
		if(head == null) {
			System.out.println("end");
			return;
		}
		if(position <0) {
			System.out.println("invalid position");
			return ;
		}
		if(position == 0) {
			deleteFromBeginning();
			return;
		}
		
		Node temp = head ;
		
		for(int i = 0 ; i< position -1  && temp.next != null ; i++) {
			temp = temp.next;
		}
		if (temp.next == null) {
            System.out.println("Position out of bounds");
            return;
	}
		 temp.next = temp.next.next;
		 
		 
		}
	
	
	
}
public class Prb1 {
	public static void main(String args[]) {
	LinkedList list = new LinkedList();
    LinkedList list1= new LinkedList();

    
    list.insertAtend(10);
    list.insertAtend(20);
    list.insertAtend(30);
    System.out.println("after insetr at endx: ");
    
    list.reverse();
    
    System.out.println("Reversed list: ");
    list.display();
    list1.concatenate(list);
    
    
    System.out.println("After concatenation: ");
    list1.display();
    
    list.head = new Node(10);
    list.head.next = new Node(20);
    list.head.next.next = new Node(30);
    list.head.next.next.next = new Node(40);
    list.head.next.next.next.next = new Node(50);
    
    list.deleteFromBeginning();
    System.out.println("After deleteFromBeginning: ");
    
    list.deleteAtposition(1);
    System.out.println("After deleteAtPosition(1): ");
    list.display();
	}
}
