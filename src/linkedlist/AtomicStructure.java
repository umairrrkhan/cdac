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
	
	public static Node insertBeginning(Node head , int val) {
		Node newnode = new Node(val);
		newnode.next = head;
		return newnode;
	}
	
	Node reverse(Node head) {
		Node prev = null;
		Node curr = head;
		Node next = null;
		
		while(curr!= null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
	
	
}
