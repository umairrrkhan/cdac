package assignment4;

import java.util.Scanner;


public class Problem5 {

	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		
		System.out.print("enter the string : " );
		String str = io.nextLine();
		
		String reverse = "";
		
		for (int i = str.length() - 1 ; i >= 0 ; i--) {
			reverse = reverse + str.charAt(i);
		}
		
		if(str.equals(reverse)) {
			System.out.println(str + "is a palidrome");
			
		}
		else { System.out.println("is not a palidrome");
		
		}
	}
	
}
