package array;

import java.util.*;

public class RotateArrayByKposition {
	
	public static void rotate(int num[] ,int k ) {
		k = k%num.length;
		reverse(num , 0 , num.length-1);
		reverse (num , 0 , k-1);
		reverse(num , k , num.length-1);
	}
	
	public static void reverse(int num[] , int start ,int end ) {
		while(start<end) {
			int temp = num[start];
			num[start] = num[end];
			num[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void main(String args[]) {
		int m [] = {1, 2, 3, 4, 5, 6, 7};

		 rotate(m, 3);

	        System.out.println(Arrays.toString(m));
		
		
	}

}
