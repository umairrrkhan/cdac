package blind150;

import java.util.*;

public class ContainDuplicateEasy {
	
	public static boolean result(int arr[]) {
		for(int i = 0 ; i< arr.length ; i++) {
			for (int j = i+1  ; j<arr.length ; j++) {
				if (arr[i]==arr[j]) {
					return true;
			}
				
			}
			
		}
		
		return false;
	}
	
	public static boolean result2(int arr[]) {
		Set<Integer> seen = new HashSet<>();
		
		for(int nums : arr) {
			if(seen.contains(nums)) {
				return true;
			}
			
			seen.add(nums);
		}
		
		return false;
	}
	
	public static void main(String args[]) {
		int m[] = {1,2,3,45,5};
		int n[] = {1,2,2,3,4,5};
		
		result(m);
		
		System.out.println(result(n));
		
		System.out.println(result2(m));
	}

}
