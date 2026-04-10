package twopointerpart1;

import java.lang.Math;

public class ContainerWithMostWater {
	
	static int maxArea(int n[]) {
		int Maxarea = 0;
		int left = 0;
		int right = n.length - 1;
		
		while(left < right) {
			int width = right - left;
			int height = Math.min(n[left]  ,  n[right]);
			int area = width * height;
			Maxarea = Math.max(Maxarea, area);
			
			if(n[left]<n[right]) {
				left++;
			}
			else {
				right--;
			}
			
		}
		return Maxarea;
	}
	
	public static void main(String args[] ) {
		
		int m [] = {1,2,45,353,4,6,456,457,57,5,75,8,8,576547};
		
		System.out.println(maxArea(m));
		
	}

}
