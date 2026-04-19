package stream;

import java.util.*;
import java.util.stream.Collectors;

public class Dp1 {

	static void result(List<Integer> l1) {
		List<Integer> res = l1.stream()
		.filter(n-> n% 2 == 0 )
		.sorted(Comparator.reverseOrder())
		.collect(Collectors.toList());
		
		System.out.println(res);
	}
	
	
	public static void main(String args[] ) {
		List<Integer> g = new ArrayList<>(Arrays.asList(1,2,3,5,6,7,8,9,9,0));
		result(g);
	}
	
}
