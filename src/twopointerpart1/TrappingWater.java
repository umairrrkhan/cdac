package twopointerpart1;


import java.lang.Math;
public class TrappingWater {
	
	static int findTotal(int n []) {
		int left = 0 ; 
		int right = n.length-1;
		int leftMax = 0;
		int rightMax = 0;
		int total = 0;
		
		while(left < right) {
			leftMax = Math.max(leftMax, n[left]);
			rightMax = Math.max(rightMax, n[right]);
			
			if(left<right) {
				total+=leftMax - n[left];
				left++;
			}
			else {
				total+=rightMax  - n[right];
			}
		}
		return total;
	}
	
	public static void main(String args[]) {
		
		int m [] = {1,2,42,45,4,645,674,7,57,568,68,68,678,76,876,786,8,768,6};
		System.out.println(findTotal(m));
		
	}

}
