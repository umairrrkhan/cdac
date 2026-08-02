package array;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
	
//	Example 1:
//
//		Input: nums = [100,4,200,1,3,2]
//		Output: 4
//		Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
	
	public static int result(int arr[]) {
		Set<Integer> number = new HashSet<>();
		
		for(int num : arr) {
			number.add(num);
		}
		
		
		int longest = 0 ;
		
		for(int num : number) {
			if(!number.contains(num -1 )) {
				int currentnum = num;
				int currentlength  = 1;
				
				while(number.contains(currentnum + 1)) {
					currentnum ++;
					currentlength ++;
					
				}
				
				longest = Math.max(currentlength, longest);
			}
			
			
		}
		
		return longest;
	}

}
