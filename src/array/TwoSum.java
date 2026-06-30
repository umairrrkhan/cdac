package array;

import java.util.*;
public class TwoSum {
	
	public int[] twoSum(int arr[] , int target){
		Map<Integer , Integer> map = new HashMap<>();
		
		for(int i = 0  ; i < arr.length ; i++) {
			int complement = target - arr[i];
			if(map.containsKey(complement)) {
				return new int [] {map.get(complement) ,i };
			}
			map.put(arr[i], i);
		}
		
		return new int [] {-1 , -1};
		
		
	}
	
	public int[] secondversion(int arr[] , int target) {
		int left = 0 ; 
		int right = arr.length-1;
		
		while(left < right) {
			int sum  = arr[left] + arr[right];
			
			
			if(sum == target) { return new int [] {arr[left] , arr[right]};
		}
		else if(sum < target) {
			left++;
		}
		else {
			right --;
		}
		}
		
		return new int [] {-1,-1};
	}
}
