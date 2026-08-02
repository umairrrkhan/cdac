package dp;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
	
	public int result(int a[] ) {
		int n = a.length;
		int dp[] = new int[n];
		
		if(n==0) return 0;
		
		Arrays.fill(dp, 1);
		
		int longest = 1 ;
		
		for(int i = 0 ; i< n ; i ++) {
			for(int j = 0 ; j< i ; j++) {
				if(a[j]< a[i]) {
					dp[i]= Math.max(dp[i], dp[j]+1);
				}
			}
			
			longest = Math.max(longest, dp[i]);
		}
		
		return longest;
	}

}
