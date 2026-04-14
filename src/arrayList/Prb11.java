package arrayList;

import java.util.*;

public class Prb11 {
	
	static void removeif(List<Integer> l1) {
		l1.removeIf(n-> n % 2 !=0 );
	}
	
	public static void main(String args[]) {
	     	List <Integer> l1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,0,0));
	     	
	     	l1.removeIf(n-> n%2 != 0 );
	     	
	     	System.out.println(l1);
	}

}
