package slidingWindow;

public class MaximumSumSubarrayofSizeKwithNegativeNumber {
	
	static int result(int n [] , int k) {
		int windowSum = 0;
		for ( int i = 0 ; i< k ; i++) {
			windowSum+= n[i];
		}
		
		int maxSum = windowSum;
		
		for( int i = k ; i< n.length ; i++) {
			windowSum+=n[i]- n[i-k];
			maxSum = Math.max(maxSum, windowSum);
		}
		
		return maxSum;
	}
	
	public static void main(String args[]) {
		int [] m = { 4, -1, 2, 1, -5, 4, 3};
		System.out.println(result(m,3));
	}

}
