package assignment4;

import java.util.Scanner;

public class Problem10 {
	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		
		System.out.print("enter a string " );
		
		String str  = io.nextLine();
		
		String result = str.replaceAll("[aeiouAEIOU]", "*");
		System.out.println("using replace all " + result);
		
	}

}
