package twopointerpart1;

public class CountpairSum {
	
	static int result(int n [] , int target) {
		int left = 0 ;
		int right = n.length - 1;
		
		int sum = 0;
		
		int count = 0 ;
		
		while(left< right) {
			sum = n[left] + n[right];
			
			if(sum== target) {
				count++;
				left++;
				right--;
				continue;
			}
			else if(sum<target){
				left++;
			}
			else {
				right--;
			}
		}
		return count;
		
		
	}
	
	public static void main(String args[]) {
		int m [] = { 1, 2, 3, 4, 5, 6, 7 };
		
		System.out.println(result(m,8));
		
	}

}
