package linkedlist;

import java.util.*;

public class Basicone {

	
	public static void main(String [] args) {
		List<Integer>list = new ArrayList<>();
		List<Integer>list2 = new LinkedList<>();
		
		  for (int i = 0; i < 100000; i++) {
	            list.add(i);
	            list2.add(i);
	        }
		  
		  long start = System.nanoTime();
		  list.get(50000);
		  
		  long end = System.nanoTime();
		  System.out.println("for array list time "+ (end- start));
		  
		  
		  start = System.nanoTime();
		  list2.get(50000);
		  end = System.nanoTime();
		  System.out.println("linked list take time "+(end -start));
	}
}
