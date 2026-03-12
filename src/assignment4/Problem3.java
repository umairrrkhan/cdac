package assignment4;

import java.util.Scanner;

public class Problem3 {
	
	public static void main(String [] args) {
		Scanner io = new Scanner(System.in);
		
		System.out.print("enter a string ");
		
		String str = io.nextLine().toLowerCase();
		
		int vowels = 0;
		int constants  = 0;
		
		for (int i = 0 ; i <str.length(); i++) {
			char ch = str.charAt(i);
			
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowels++;
			}else {
				constants++;
			}
			
			System.out.println("Vowels: " + vowels);
	        System.out.println("Consonants: " + constants);
		}
	}

}
