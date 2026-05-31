package linkedlist;

public class AtomicStructure {

	public static void main(String args[]) {
		Node head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		
		head.next = second;
		second.next = third;
		
		System.out.println("My Linked List:");
		
		Node.traverse(head);
		
		System.out.println("end here ");
	}
	
}

class Node{
	int val ;
	Node next;
	
	Node(int val){
		this.val= val;
		this.next = null;
		
	}
	
	public static void traverse(Node head) {
		Node current = head;
		while(current!=null) {
			System.out.println(current.val);
			current = current.next;
		}
		
		System.out.println("null");
	}
	
	
}
