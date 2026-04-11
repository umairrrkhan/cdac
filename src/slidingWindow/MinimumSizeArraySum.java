package slidingWindow;

public class MinimumSizeArraySum {

	public static int find(int n[] , int target) {
		int left = 0;
		int minLen = Integer.MAX_VALUE;
		int sum = 0;
		
		for(int right = 0 ; right < n.length ; right++) {
			sum += n[right] ;
			
			while(sum>=target) {
				sum-= n[left];
				minLen = Math.min(minLen, right-left+1);
				left++;
			}
		}
		
		return minLen== Integer.MAX_VALUE? 0: minLen; // shortcut of the if else ;
	}
	
	public static void main(String args[]) {
	   int m [] = {1,1,1,1,1,1,1};
	   System.out.println(find(m , 7));
	}
	
}
