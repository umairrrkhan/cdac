package assignment4;

import java.util.Scanner;

public class Problem2 {
	
	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		
		System.out.print("eneter  a string ");
		
		String str = io.nextLine();
		
		int length = 0;
		
		try {
			while(true) {
				str.charAt(length);
				length++;
			}
		}catch(Exception e) {
				// exception means we reached the end
			}
			
			System.out.println("length : " + length);
		
	}

}
