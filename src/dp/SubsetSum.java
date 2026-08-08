package dp;

public class SubsetSum {
	
	public boolean result(int nums[]) {
		int totalsum = 0;
		
		for(int num : nums) {
			totalsum+=num;
			
		}
		
		
		if(totalsum%2!=0 ) {return false ;}
		
		int target = totalsum/2;
		
		boolean dp[] = new boolean[target+1];
		
		dp[0] = true;
		
		for(int num : nums) {
			for(int sum = target ; sum>=num; sum--) {
				dp[sum]= dp[sum] || dp[sum-num];
			}
		}
		
		return dp[target];
	}

}

//416. Partition Equal Subset Sum
//Solved
//Medium
//Topics
//premium lock icon
//Companies
//Given an integer array nums, return true if you can partition the array into two subsets such that the sum of the elements in both subsets is equal or false otherwise.
//
// 
//
//Example 1:
//
//Input: nums = [1,5,11,5]
//Output: true
//Explanation: The array can be partitioned as [1, 5, 5] and [11].
