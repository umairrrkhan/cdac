package slidingWindow;

public class Longestsumbarray {
	
	static int result(int n [] , int k ) {
		int left = 0;
		int sum = 0;
		int maxLen = 0;
		
		for(int i = 0 ; i< n.length ; i++) {
			sum+=n[i];
			
			while(sum>k ) {
				sum -= n[left];
				left++;
				
			}
			
			maxLen= Math.max(maxLen, i-left + 1);
		}
		
		
		
		return maxLen;
	}
	
	public static void main(String args[]) {
		
		int m [] = {1, 2, 3, 4, 5};
		System.out.println(result(m,10));
		
	}

}
