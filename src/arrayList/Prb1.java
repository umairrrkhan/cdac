package arrayList;

import java.util.*;

public class Prb1 {
	
	// reverse thing in the arraylist .
	
	public static <T> void reverseInPlace(ArrayList<T> list) {
		if(list == null || list.size() <= 1) return ;
		
		int left = 0;
		int right = list.size()-1;
		
		while(left < right) {
			T temp = list.get(left);  //set mean here is th
			list.set(left, list.get(right));
			list.set(right, temp);
			left++;
			right--;
		}
	}
	
	public static void main(String args[]) {
		
		ArrayList<Integer> list = new ArrayList<>();

	    list.add(1);
	    list.add(2);
	    list.add(3);
	    list.add(4);
	    list.add(5);
	    
	    System.out.println(list);
		
	    reverseInPlace(list);
	    System.out.println(list);
	}

}
