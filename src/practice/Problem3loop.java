package practice;

// Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321.


import java.util.Scanner;

public class Problem3loop {
	
	public static void main(String[] args) {
		
		Scanner io = new Scanner(System.in);
		
		System.out.print("bro write the number we have to reverse = ");
		
		int num = io.nextInt();
		
		int reverse = 0;
		
		while (num >0 ) {
			
			int digit = num %10;  // whole math is here actually give u last digit 
			reverse = reverse*10 +digit ;
			num = num/10 ; // here it will delete that 
			
			System.out.println(digit + " digit   " + reverse +"  reverse  "+ num);
			
		}
		
		System.out.println(reverse);
		
	}
	

}
