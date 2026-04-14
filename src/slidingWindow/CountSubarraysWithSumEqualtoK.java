package slidingWindow;

import java.util.*;

public class CountSubarraysWithSumEqualtoK {
	
	public static int  main(int n[] ) {
		Map<Integer, Integer> prefixCount = new HashMap<>();
		
		int sum = 0;
		int count = 0;
		int k = 7;
		
		prefixCount.put(0, 1);
		
		for( int num : n) {
			sum+= num;
			count += prefixCount.getOrDefault(sum - k, 0);
			  prefixCount.put(sum, 
                      prefixCount.getOrDefault(sum, 0) + 1);
		}
		
		return count;
	}
	
	public static void main(String args[] ) {
		
	}

}
