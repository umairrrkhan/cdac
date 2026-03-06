package assignment1;

import java.util.Scanner;

public class Problem3 {
	
	public static void main(String[]args) {
		
		Scanner numa= new Scanner(System.in);
		System.out.println("first number ");
		int num1 = numa.nextInt();
		
		Scanner numb = new Scanner(System.in);
		System.out.println("second number");
		int num2 = numb.nextInt();
		
		if (num1> num2) {
			System.out.println(num1 + " is bigger ");
		}
		
		else if (num2>num1) {
			System.out.println(num2 + " is bigger ");
		}
		
		else if (num1 == num2) {
			System.out.println("both are equal lol !!!!!");
			
		}
		
		else {
			System.out.println(" use int number");
		}
	}

}
