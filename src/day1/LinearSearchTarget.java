package day1;

import java.util.Scanner;

public class LinearSearchTarget {

	public static void main(String [] args) {
		Scanner io = new Scanner(System.in);
		
		System.out.println("enter the target : ");
		
		int target = io.nextInt();
		
		int [] arr = new int[7];
		
		Input(arr);
		
		int result = Target(arr , target);
		
		System.out.println(result);
		
		
		
	}
	
	public static void Input (int n [] ) {
		Scanner f = new Scanner(System.in);
		
		System.out.println(" enter the number of array ");
		
		for ( int i = 0 ; i < n.length ; i++) {
			n[i] = f.nextInt();
		}
	}
	
	
	public static int Target(int n[] , int target ) {
		
		int index = -1 ;
		
	   for ( int i = 0 ; i < n.length ; i++) {
		   if ( n[i] == target) {
			   
			   index = i ;
			   
			   
		   }
	   }
	
	   return index;
		
		
	}
	
}
