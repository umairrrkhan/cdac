package datasa;

import java.util.Scanner;

public class Task1 {
	
	public static void main(String [] args) {
		
		int [] arr = {1,2,3,4,5,6,7,8,9,0};
		
		printarray(arr);
		
		int max1 = findmax(arr);
		
		System.out.println(max1);
		
	}
	
	
	
	public static void printarray(int [] arr) {
		
		
		
		for(int i = 0 ; i< arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
	}
	
	public static int  findmax(int [] arr ) {
		
		if (arr.length == 0) return -1;
		
		int max = arr[0];
		
		for ( int i  = 0 ; i< arr.length ; i++ ) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		return max;
		
		
	}

}
