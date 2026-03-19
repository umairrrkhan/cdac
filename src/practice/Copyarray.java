package practice;

import java.util.Scanner;

public class Copyarray {
	
	public static void main(String [] args) {
		int [] arr = new int[6];
		
		Input(arr);
		
		int [] copy = new int[arr.length];
		
		Copyarray(arr , copy);
		
		Display(copy);
		
		
	}
	
	
	
	
	public static void Input (int n [] ) {
		Scanner io = new Scanner(System.in);
		
		System.out.println("enter the number");
		
		for ( int i = 0 ; i< n.length ; i++) {
			n[i] = io.nextInt();
			
		}
	}
	
	public static void Copyarray(int n [] , int c[] ) {
		for ( int i = 0 ; i<n.length ; i++   ) {
			c[i] = n[i];
			
			
		}
		
	}
	
	public static void Display(int c[]) {
		for (int num : c) {
			System.out.println(num);
		}
	}

}
