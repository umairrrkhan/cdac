package arrayList;

import java.util.*;
import java.util.List;

public class P17 {

	static void findMid(List<Integer> a) {
		int mid = 0; // so integer cant be null okay
		
		Iterator<Integer> slow = a.iterator();
		Iterator<Integer> fast = a.iterator();
		
		while(fast.hasNext()) {
			mid = slow.next();
			fast.next();
			if(fast.hasNext()) {
				fast.next();
			}
		}
		
		System.out.println(mid);
	}
	
	
	public static void main(String args[]) {
		List<Integer> h = Arrays.asList(1,2,3,4,5,6,7,8,9);
		findMid(h);
	}
}
