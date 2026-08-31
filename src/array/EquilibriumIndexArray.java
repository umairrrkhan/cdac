package array;

## 724. Find Pivot Index leetcode 
	
public class EquilibriumIndexArray {
	
	public static int result(int [] arr) {
		int totalsum = 0;
		
		for(int i : arr) {
			totalsum+=i;
		}
		
		int leftsum = 0;
		
		for(int i = 0; i < arr.length ; i++) {
			int rightsum = totalsum - leftsum - arr[i];
			
			if(leftsum== rightsum) {
				return i ;
			}
			
			leftsum+=arr[i];
		}
		
		
		return -1;
	}

}
