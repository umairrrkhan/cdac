package assignment1;

import java.util.Scanner;

public class Problem4 {
	
	public static void main(String[] args) {
		
		Scanner num1 = new Scanner(System.in);
		System.out.print("writew ur balance = ");
		int balance = num1.nextInt();
		
		Scanner num2 = new Scanner(System.in);
		System.out.print("write the withdraw amount =  ");
		int withdraw = num2.nextInt();
		
        if (balance > withdraw && withdraw !=balance) {
        	System.out.println("u can withdraw");
        }
        else {
        	System.out.println("not possible withdraw ");
        }
	}
	
}
