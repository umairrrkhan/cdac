package practice;

import java.util.Scanner;

public class Sumofevenodd {
	
	public static void main(String [] args) {
		Scanner io = new Scanner(System.in);
		
		System.out.println("eneter the number");
		int num = io.nextInt();
		int evenSum = 0 ;
		int oddSum = 0;
		while(num > 0) {
			int digit  = num%10;
			if(digit%2==0) {
				evenSum+=digit;
			}
			else {
				oddSum+=digit;
			}
			
			num = num/10;
		}
		System.out.println(evenSum);
		System.out.println(oddSum);
	}

}
