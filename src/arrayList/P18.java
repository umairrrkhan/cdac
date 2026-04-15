package arrayList;


class Node{
	int data;
	Node next;
	
	Node(int d){  
		data = d;
		}
	
	
}
public class P18 {
	public static boolean hasCycle(Node head) {
		if(head == null) return false;
		
		Node slow = head ;
		Node fast = head;
		
		while(fast!=null && fast.next!= null) {
			 slow = slow.next;
			fast = fast.next.next;
			
			if(slow== fast)return true;
			
		}
		
		return false;
	}
	
	public static void main(String args[] ) {
		Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        
        head.next = second;
        second.next = third;
        third.next = fourth;
        
        System.out.println(hasCycle(head));
        
        fourth.next = second;
        System.out.println(hasCycle(head));
	}

}
