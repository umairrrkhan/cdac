package arrayList;
import java.util.*;
import java.util.stream.Collectors;

import java.util.stream.IntStream;


public class P15 {
	
	public static void main(String args[]) {
		int [] m = {1,2,3,4,5,6,7};
		
		//arrays to arrystolist 
		
		List<Integer> li = IntStream.of(m)
				           .boxed()
				           .collect(Collectors.toList());
		
		System.out.println(li);
				
		// arrayslist to array 
		
		int [] n = li.stream()
				.mapToInt(Integer :: intValue)
				.toArray();
		
		
		System.out.println(Arrays.toString(n));
	}
}
