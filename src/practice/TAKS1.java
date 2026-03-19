package practice;

import java.util.Scanner;

public class TAKS1 {
	
	public static void main(String [] args) {
		
		
		
		
		int [] arr = new int[3];
		
		displayData(arr);
		
		displayit(arr);
		
		int resultSum = sumofNum(arr);
		System.out.println(resultSum);
		
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
	
	
	public static int sumofNum(int n [] ) {
		int sum = 0 ;
		
		for ( int i = 0 ; i < n.length ; i++) {
			sum+= n [i];
			
		}
		
		return sum;
	}
		
		
		
	}


