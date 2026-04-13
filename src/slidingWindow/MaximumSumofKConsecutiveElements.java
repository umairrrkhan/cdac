package slidingWindow;

import java.util.*;

public class MaximumSumofKConsecutiveElements {
	
	static int result(int n [] ) {
		int k = 3;
		
		
		
		int windowSum = 0;
		
		for( int i = 0 ; i< k ; i++) {
			windowSum += n[i];
		}
		
		int maxSum = windowSum;
		for( int i = k ; i< n.length ; i++) {
			windowSum+=n[i] - n[i-k];
			maxSum = Math.max(maxSum, windowSum);
		}
		
		return maxSum ;
		
	}
	
	public static void main(String args[]) {
		int m[] = { 4,  2,  1,  7,  8,  1,  2};
		
		System.out.println(result(m));
		
	}

}
