package datasa;

import java.util.Scanner;

public class OnetoN {
	
	public static void main(String [] args) {
		
		int arr[] = {1,2,3,4,5,6,7,9};
		
		int m = 9;
		
		result(arr , m);
		
	}
	
	
	public static void result(int n [] ,int m  ) {
		int sum = 0 ;
		for ( int i = 0 ; i < n.length ; i++ ) {
			sum += n[i];
		}
		
		int expectedsum = m * (m+1)/2;
		
		int missing = expectedsum - sum;
		
		System.out.println("missign : "+ missing);
		
	}
	
	

}
