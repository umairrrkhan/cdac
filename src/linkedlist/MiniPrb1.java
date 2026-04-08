package linkedlist;

import java.util.*;
public class MiniPrb1 {
	
	public static void main(String args[]) {
		List<Integer> l1 = new ArrayList<>();
	    for(int i = 0 ; i< 100; i++) {
	    	l1.add(i);
	    }
	    
	    Collections.sort(l1);
	    System.out.println(l1);
	    Collections.sort(l1,Collections.reverseOrder());
	    System.out.println(l1);
	    
	    List<Integer> l2 = new LinkedList<>();
	    System.out.println(l2);
	    
	    l2.remove(Integer.valueOf(1));
	}

}
