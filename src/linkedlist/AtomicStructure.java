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
	
	Node findmiddle(Node head) {
		Node slow  = head;
		Node fast = head ;
		
		while(fast!=null && fast.next!=null) {
			slow = slow.next ;
			fast = fast.next.next;
		}
		return slow;
	}
	
	public static boolean hasFloydCycle(Node head) {
		Node slow = head ;
		Node fast = head;
		
		while(fast!=null&& fast.next!=null) {
			slow = slow.next ;
			fast = fast.next.next;
			if(slow == fast) {
				return true;
			}
		}
		
		return false;
	}
	
	public static Node removeNthNodeFromEnd(int n , Node head) {
		Node dummy = new Node(-1);
		dummy.next = head;
		Node slow = dummy;
		Node fast = dummy;
		
		for(int i = 0 ; i<n ; i++) {
			fast = fast.next;
		}
		
		while(fast.next!=null) {
			slow = slow.next;
			fast = fast.next;
		}
		
		
		slow.next  = slow.next.next ;
		
		return dummy.next;
	}
	
	Node mergeTwoLists(Node l1 , Node l2) {
		Node dummy = new Node(-1);
		Node curr = dummy;
		while(l1!=null && l2!=null) {
			if(l1.val<=l2.val) {
				curr.next = l1;
				l1 = l1.next;
			}else {
				curr.next = l2.next;
				l2= l2.next;
			}
		}
		
		if(l1!=null) curr.next= l1.next;
		if(l2!=null) curr.next= l2.next;
		
		return dummy.next;
	}
	
}
