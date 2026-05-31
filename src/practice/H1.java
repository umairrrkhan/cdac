package practice;

import java.util.*;


public class H1 {
	
	public static int [] result(int [] arr , int target) {
		Map<Integer , Integer> gh = new HashMap<>();
		
		for(int i = 0 ; i<arr.length ; i++) {
			int second = target - arr[i];
			
			if(gh.containsKey(second)) {
				return new int [] {gh.get(second), i};
			}
			gh.put(arr[i], i);
			
		}
		
		return new int[] {-1, -1}; 	
		
	}
	
	
	
	public static void main(String args[]) {
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5); 
		
		Map<Integer,Integer> freq = Map.of(
				1, 2,
				2,3,
				3,6
				);
		
		System.out.println(freq.get(3));
		
		int arr[] = {1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(result(arr,6)));
		
	}

}
