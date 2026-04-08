package linkedlist;

import java.util.*;

public class Prb1 {
	
	static boolean print(List<String> s1) {
		return s1.removeIf(n -> n.startsWith("A"));
	}
	
	public static void main(String [] args) {
		List<Integer> l1 = new ArrayList<>();
		
		for(int i = 0 ; i<100 ; i++) {
			l1.add(i);
		}
		
		l1.removeIf(n -> n%2==0);
		

		l1.set(1, 12);
		l1.set(0, null);
		l1.remove(12);
		
		
		
		System.out.println(l1);
		
		List <Integer> l2 = new LinkedList<>(l1);
		System.out.println(l2);
		
		System.out.println(l1.size());
	    l1.clear();
	    System.out.println(l1);
	    
	    List<String> r = new ArrayList<>(Arrays.asList("Apple " ,"Banana", "mango"));
	    System.out.println(Prb1.print(r));
	  
	    System.out.print(r);
	    
	}

}
