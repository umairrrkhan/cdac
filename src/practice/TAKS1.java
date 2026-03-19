package practice;

import java.util.Scanner;

public class TAKS1 {
	
	public static void main(String [] args) {
		
		
		
		
		int [] arr = new int[3];
		
		displayData(arr);
		
		displayit(arr);
		
	}
	
	
	public static void displayData(int n [] ) {
		Scanner io = new Scanner(System.in);
		System.out.println("enter the number");
		for ( int i = 0 ; i <  n.length; i++) {
			n[i] = io.nextInt();
			
		}
	}
		
		
	public static void displayit(int n []) {
			for (int i = 0 ; i< n.length ; i++) {
				System.out.print(n[i] + " ");
			}
		}
		
		
		
	}


