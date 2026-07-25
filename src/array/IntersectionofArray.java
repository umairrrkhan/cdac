package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class IntersectionofArray { //sorted
	
	public static List<Integer> result(int a1[] , int a2[]){
	int i = 0 ; 
	int j = 0;
	
	List<Integer> l = new ArrayList<>();
	while(i < a1.length && j < a2.length) {
		if(a1[i]< a2[j]) {
			i++;
		}else if (a1[i] > a2[j]) {
			j++;
		}else {
			l.add(a1[i]);
			i++;
			j++;
		}
	}
	
	return l ;
		
		
	}
	
	// this is the interview version 
	
	public static int[] intersection (int [] nums1 , int [] nums2) {
		Set<Integer> set = new HashSet<>();
		
		for(int num : nums2) {
			set.add(num);
		}
		
		
		Set<Integer> resultSet = new Hashset<>();
		
		for(int num : nums1) {
			if(set.contains(num)) {
				resultSet.add(num);
			}
		}
		
		int [] result = new int [ resultSet.size()];
		
		int i = 0 ;
		for (int num : resultSet) {
			result[i++] = num;
		}
		
		return result;
	}
}
