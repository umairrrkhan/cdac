package array;

// Write program to define array of size N and print sum  and average of all elements  

import java.util.Scanner;

public class Sum {
	
	public static void main(String [] args) {
		
		Scanner io = new Scanner(System.in);
		
		int [] arr = new int[5];
		
		
		int sum = 0;
		
		for (int i = 0 ; i<5 ; i++) {
			System.out.println(i + "this is the serial");
			
			arr[i]  = io.nextInt();
			
			
			
			sum += arr[i];
			
		}
		
		System.out.println(sum);
	}
	
	

}
