package array;

public class FindmaxConsecutive { // LeetCode 485 — Max Consecutive Ones.
	
	public static int result(int arr[]) {
		int count = 0;
		int maxlen = 0 ;
		
		for(int num : arr) {
			if(num == 1) {
				count ++;
				maxlen = Math.max(maxlen, count);
			}else {
				count = 0 ;
			}
		}
		
		return maxlen ;
	}

}
