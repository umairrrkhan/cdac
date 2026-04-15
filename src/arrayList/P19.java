package arrayList;

import java.util.*;

public class P19 {
	
	public static List<Integer> flatten(List<?> list){
		List<Integer> result = new ArrayList<>();
		Deque<Object > stack = new ArrayDeque<>();
		
		for (int i = list.size() - 1; i >= 0; i--) {
	        stack.push(list.get(i));
	    }
		
		while(!stack.isEmpty()) {
			Object obj = stack.pop();
			if(obj instanceof  Integer) {
				result.add((Integer) obj);}
				else if(obj instanceof List) {
					List<?> nested = (List<?>) obj ;
					for( int i = nested.size() -1 ; i>=0 ;i-- ) {
						stack.push(nested.get(i));
					}
				}
			}
			return result;
		
	}
	
	public static void main(String args[] ) {
		
		List<Object> nested = Arrays.asList(
		        1,
		        Arrays.asList(2, 3),
		        Arrays.asList(4, Arrays.asList(5, 6))
		    );
		
		System.out.println( nested);
		
		List<Integer> flat = flatten(nested);
	    
	    System.out.println( flat);
		
	}
}
