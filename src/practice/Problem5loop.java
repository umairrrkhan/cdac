package practice;

// Write a program in java to find the sum of the even and odd digits of the number which is given as input.

import java.util.Scanner;

public class Problem5loop {
	
	public static void main(String[] args) {
		
		Scanner io = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num = io.nextInt();
		num = Math.abs(num);
		
		int evenSum = 0;
		int oddSum = 0;
		
		int orginal = num ;
		
		while (num >0) {
			int lastDigit = num%10;
			if(lastDigit%2 == 0) {
				
				evenSum+=lastDigit;
				
			}
			else{
				oddSum+=lastDigit;
			}
			num = num/10;
		}
		
		System.out.println(evenSum);
		System.out.println(oddSum);
		
		io.close();
	}

}
