package linkedlist;

import java.util.*;

public class ReverseLinkedList {
	
	static class Node{
		int value;
		Node next;
		
		
		Node(int value){ this.value= value;}
		
		static Node reverse(Node head) {
			Node prev= null;
			Node current = head;
			Node next = null;
			
			while(current!=null) {
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;
			}
			 return prev;
		}
		
		static void print(Node head) {
			while(head!=null) {
				head = head.next;
				System.out.print(head.value + " ");
			}
			
			System.out.println();
		}
	}

}
