package assignment4;

import java.util.Scanner;

public class Problem9 {
	
	public static void main(String [] args) {
		Scanner io = new Scanner(System.in);
		
		System.out.print("enter a string ");
		
		String str = io.nextLine();
		
		int alphabet = 0 ;
		int digit = 0 ;
		int special = 0 ;
		
		for (int i = 0  ; i <str.length(); i++) {
			char ch = str.charAt(i);
			
			if (Character.isLetter(ch)) {
			   alphabet++;	
			}else if (Character.isDigit(ch)) {
				digit++;
			}else if (Character.isWhitespace(ch)) {
				special++;
			}
			
		}
		
		System.out.println("Alphabets: " + alphabet);
        System.out.println("Digits: " + digit);
        System.out.println("Special characters: " + special);
	}

}
