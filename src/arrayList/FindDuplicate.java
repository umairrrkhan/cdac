package arrayList;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicate {
	
	public static <T> List <T> findDuplicate(List<T> list){
		if(list == null) return Collections.emptyList();
		
		Set<T> seen = new HashSet<>();
		Set<T> duplicates = new HashSet<>();
		
		
//		return list.stream()
//	               .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
//	               .entrySet().stream()
//	               .filter(e -> e.getValue() > 1)
//	               .map(Map.Entry::getKey)
//	               .toList();
		
//		for (T item : list) {
//	        if (!seen.add(item)) {
//	            duplicates.add(item);
//	        }
//	    }
//
//	    return new ArrayList<>(duplicates);
//	}
		
		for ( T item : list) {
			if(seen.contains(item)) {
				duplicates.add(item);
			}
			else { seen.add(item);}
		
			return new ArrayList<>(duplicates);
		}
		return list;
		}
	
	
	public static void main(String args[]){
		
		List<Integer> li = new ArrayList<>(Arrays.asList(1,2,3,4,5,5,6,7,765,5,55,5,5));
		findDuplicate(li);
		System.out.println(li);
		
	}

}
