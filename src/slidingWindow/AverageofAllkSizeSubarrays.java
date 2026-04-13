package slidingWindow;

public class AverageofAllkSizeSubarrays {
	
	public static double [] result(int n []) {
		int windowSum = 0;
		int k = 5;
		
		
		for( int i = 0 ; i < k; i++) {
			windowSum+= n[i];
		}
		
		double [] avgSum  = new double[n.length - k + 1  ];
		
		avgSum[0] = (double) windowSum/k;
		int left = 1;
		for( int i = k ; i< n.length ; i++) {
			windowSum+=n[i] - n[i-k];
			avgSum[left] = (double) windowSum/k;
			left++;
		}
		
		
		return avgSum ;
		
	}
	
	public static void main(String [] args) {
		
		int m [] = {1,3,2,6,-1,4,1,8,2};
		System.out.println(java.util.Arrays.toString(result(m)));
		
	}

}
