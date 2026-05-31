package hashMap;

import java.util.*;
public class Xi2 {
	
	public static void main(String args[]) {
		int [] nums = {2,3,4,5,11,15};
		int target = 9;
		Map<Integer , Integer> map = new HashMap<>();
		
		for( int i = 0; i<nums.length; i++) {
			int complement = target - nums[i];
			if(map.containsKey(complement)) {
				  System.out.println("Indices: " + map.get(complement) + ", " + i);				break;
			}
			
			
			map.put(nums[i], i);
		}
		
	}

}
