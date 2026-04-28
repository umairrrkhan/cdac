package placeInterview;

public class P4 {
	
	public static int result(int m[] , int k ) {
		int sum = 0;
		for(int i = 0 ; i< k ; i++){
			sum+=m[i];
		}
		
		int maxSum = sum;
		
		for(int i = k ; i< m.length ; i++) {
			sum = sum+m[i] - m[i-k];
			maxSum = Math.max(sum , maxSum);
		}
		
		return maxSum;
	}
	
	public static void main(String args[]) {
		int [] x = {1,3,5,2,8,1,4};
		
		System.out.println(result(x,3));
	}
}
