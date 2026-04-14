package arrayList;

import java.util.*;

public class Prb13 {
	
	public static int restul(List<Integer>io ) {
		int max = io.stream()
                .max(Integer::compare)           
                .orElseThrow();  
		
		return max;
	}
	
	public static void main(String args[]) {
		List <Integer> io = Arrays.asList(12,3,4,5,6,7,8,4,4,56,43);
		int max = Collections.max(io);
		System.out.println(max);
		
		System.out.println(restul(io));
	}

}
