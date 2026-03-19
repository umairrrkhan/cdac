package datasa;

import java.util.Scanner;

public class Secondlargest {
	
	public static void main(String[] args) {
		
		int [] arr = new int [5];
		
		Input(arr);
		
		int firstt = largest(arr);
		
		System.out.println(firstt);
		
		int second = secondLargest(arr , firstt);
		
		System.out.println(second);
		
		
		
	}
	
	
	public static void Input(int n [] ) {
		
		Scanner io = new Scanner(System.in);
		
		System.out.println("enter a number");
		
		for ( int i = 0 ; i< n.length ; i++) {
			n[i] = io.nextInt();
		}
	}
	
	public static int largest(int n[] ) {
		
		int first  = n[0];
		
		for ( int i = 0 ; i< n.length ;i++) {
			if (n[i] > first ) {
				first = n[i];
			}
		}
		
		return first ;
		
	}
	
	public static int secondLargest(int n[] , int first) {
		int secondlargest = Integer.MIN_VALUE;
		
		for ( int i = 0 ; i< n.length ; i++) {
			if (n[i] > secondlargest  && n[i] < first) {
				secondlargest = n[i];
			}
		}
		
		return secondlargest;
	}
	

}
