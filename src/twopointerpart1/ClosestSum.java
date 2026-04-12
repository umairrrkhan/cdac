package twopointerpart1;

import java.util.*;

public class ClosestSum {

	public static void main(int n [] , int target) {
		int left = 0 , right = n.length -1;
		int closestSum = n[left] + n[right];
		int bestLeft = left , bestRight = right;
		
		while(left  < right) {
			
			int sum = n[left] + n[right] ;
			
			if(Math.abs(sum- target)< Math.abs(closestSum- target)){
				closestSum = sum;
				bestLeft = left;
				bestRight = right;
			}
			
			if (sum < target) left++;   // return new int[]{arr[bestLeft], arr[bestRight]};  this is when put when the sum == target then returh 
			
            else right--;
			
		}
		
		System.out.println(n[bestLeft] +" : " + n[bestRight]);
	}
	
	public static void main(String args[]) {
		int [] x = { 10, 22, 28, 29, 30, 40 };
		
		main(x,54);
	}
}
