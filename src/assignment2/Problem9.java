package assignment2;

import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		System.out.println("enter the number :  ");
		
		int num = io.nextInt();
		
		while (num > 0) {
			if (num %2!=0 ) {
				System.out.println("this is  a prime number =  "+ num);
				break;
			}
			
			else 
			{
				System.out.println("try again ");
				break;
			}
			
		}
		
	}
	
}
