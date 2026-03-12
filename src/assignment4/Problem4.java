package assignment4;

import java.util.Scanner;

public class Problem4 {
	
	public static void main(String[] args) {
		
		Scanner io = new Scanner(System.in);
		
		System.out.print("enter a string : " );
		
		String str = io.nextLine();
		
		String reverse ="";
		
		for (int i  = str.length() - 1 ; i>= 0 ; i--) {
			reverse = reverse + str.charAt(i);
		}
		
		System.out.println("Original : " + str);
		System.out.println("Revrersed : " + reverse);
		
	}

}
