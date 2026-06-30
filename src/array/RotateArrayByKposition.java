package array;

import java.util.*;

public class RotateArrayByKposition {
	
	public static void rightRotateArray(int num[] ,int k ) {
		k = k%num.length;
		reverse(num , 0 , num.length-1);
		reverse (num , 0 , k-1);
		reverse(num , k , num.length-1);
	}
	
	// the previous version kinda hard 
	
	public static void rightRotate(int num [] , int k ) {
		int n = num.length -1;
		k = k %n;
		leftRotateArraay(num , n-k);
	}
	
	public static void leftRotateArraay(int [] arr , int k ) {
		int n = arr.length ;
		k = k % n ;
		
	reverse (arr , 0, k-1);  // first
	reverse(arr , k , n-1);  // rest 
	reverse (arr , 0 , n -1); //all
	
	}
	
	public static void leftRotateByOne(int [] arr) {
		int temp = arr[0];
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length] = temp;
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
	
	
	// did the program on my note 
	
	public static void main(String args[]) {
		int m [] = {1, 2, 3, 4, 5, 6, 7};

		leftRotateArraay(m, 3);

	        System.out.println(Arrays.toString(m));
		
		
	}

}
