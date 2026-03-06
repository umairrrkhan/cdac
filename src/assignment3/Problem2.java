package assignment3;

import java.util.Scanner;

public class Problem2 {
	
	public static void main(String[] args) {
		
		Scanner io = new Scanner(System.in);
		
		System.out.println("Enter positive number");
		
		int  num = io.nextInt();
		
		if(num%3==0) {
			System.out.println("Fizz");
		}
		
		else if (num%5==0) {
			System.out.println("Buzz");
		}
		else if(num%3==0 && num%5==0) {
			System.out.println("FizzBuzz");
		}
		else {
			System.out.println("what u doing enter number");
		}
	}

}
