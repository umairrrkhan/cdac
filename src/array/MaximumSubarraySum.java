package array;


//  Maximum Subarray (LeetCode 53)


public class MaximumSubarraySum {
	
	
	public static int maxSubarray(int[] n) {
		int max = n[0];
		int maxending = n[0];
		
		for(int i = 1; i<n.length ; i++) {
			maxending = Math.max(maxending + n[i], n[i]);
			
			max = Math.max(maxending, max);
		}
		
		return max;
	}
	
	public static int result(int [] n ) {
		int maxSofar = n[0];
		int maxendinghere = n[0];
		
		for(int i = 1 ; i<n.length ; i ++ ) {
			maxendinghere = Math.max(maxendinghere + n[i], n[i]);
			maxSofar = Math.max(maxendinghere, maxSofar);
		}
		
		return maxSofar;
	}
	
	public static void main(String args[]) {
		int m [] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		
		System.out.println(maxSubarray(m));
	}

}
