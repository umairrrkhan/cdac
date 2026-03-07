package practice;

// Write a program to print Fibonacci series of n terms where n is input by user :
// 0 1 1 2 3 5 8 13 24 .....

// well look formula is simple but its kinda hard too bro 

import java.util.Scanner;

public class Problem5 {
	
	public static void main(String[] args) {
		
		int a = 0 ;
		int b = 1;
		
		Scanner io = new Scanner(System.in);
		
		System.out.print("enter number = ");
		
		int num = io.nextInt();
		
		for (int i = 0 ; i <= num ; i ++) {
		System.out.print(a);
		 int c = a+b;
		 a = b;
		 b= c;
		 
		 
		 
		}
	}
	
	

}
