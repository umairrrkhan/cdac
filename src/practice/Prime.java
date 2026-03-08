package practice;

import java.util.Scanner;

// Write a program to check if given number is prime or not

public class Prime {
	
	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		System.out.println("eneter the number");
		
		int num = io.nextInt();
		
		boolean isprime = true;
		if (num == 2) {
			System.out.println("this is prime");
		}
		
		for (int i = 2 ; i<= Math.sqrt(num); i++) {
			if (num % i == 0) {
				isprime = false;
				break;
			}
		}
		
		System.out.println(isprime);
		
	}
	

}
