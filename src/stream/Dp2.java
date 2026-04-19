package stream;

import java.util.stream.*;

import java.util.*;

public class Dp2 {
	
	static void result(List<Integer> l1) {
		Integer res = l1.stream()
				.max(Integer:: compareTo)
				.orElseThrow(() -> new NoSuchElementException("this is the end "));
		System.out.println(res);
				
	}
	
	public static void main(String args[] ) {
		List<Integer> u = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,0));
		result(u);
	}

}
