package twopointerpart1;

public class TwoSum {
	static void result(int n[] , int target) {
		int left = 0;
		int right = n.length-1;
		
		while(left < right) {
			int sum = n[left] + n[right];
			
			if(sum == target) {
				System.out.println(n[left] + " + " + n[right]);
				break;
			}
			
			else if(sum< target) {
				left++;
			}
			else {
				right--;
			}
		}
	}
	
	static void result2(int n[] , int target) {
		int left = 0;
		int right = n.length-1;
		int count = 0;
		
		while(left < right) {
			int sum = n[left] + n[right];
			
			if(sum == target) {
				System.out.println(n[left] + " + " + n[right]);
				count++;
				left++;
				right--;
			}
			
			else if(sum< target) {
				left++;
			}
			else {
				right--;
			}
		}
	}
	public static void main(String args[]) {
		
		int m[] = {1,2,3,4,5,6,7,8,9};
		
		TwoSum.result(m, 8);
		TwoSum.result2(m, 8);
		
		
		
	}

}
