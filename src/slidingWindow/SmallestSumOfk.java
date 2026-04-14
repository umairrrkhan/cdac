package slidingWindow;

import java.util.*;

public class SmallestSumOfk {
	
	static int result(int n[] , int target) {
		int left = 0;
		int sum = 0;
		int minLen = Integer.MAX_VALUE;
		
		for(int right = 0 ; right <n.length ; right++) {
			sum+= n[right];
		    while(sum>= target) {
		    	minLen = Math.min(minLen, right-left + 1);
		    	sum-=n[left];
		    	left++;
		    }
		}
		
		return (minLen== Integer.MAX_VALUE)? 0 : minLen;
	}
	
	public static void main(String args[] ) {
		
		int[] m = {2, 3, 1, 2, 4, 3};
		System.out.println(result(m, 7));
		
	}

}
