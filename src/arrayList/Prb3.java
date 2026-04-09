package arrayList;

import java.util.*;
import java.util.stream.Collectors;

public class Prb3 {
	
	public static List <Integer> Process(List<Integer> m){
		if(m == null) return Collections.emptyList();
		
		return m.stream()
                .filter(n -> n != null && n % 2 == 0)
                .map(n -> n * n)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
	}
	
	public static void main(String args[]) {
		
		List<Integer> b = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,6,7,8,8,9,98,6,5,44));
		
		Process(b);
		System.out.println(b);
		
		
		
	}

}
