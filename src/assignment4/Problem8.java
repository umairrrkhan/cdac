package assignment4;

import java.util.Scanner;

public class Problem8 {
	
	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		
		System.out.print("enter the string : ");
		
		String str = io.nextLine();
		
		String result = str.replaceAll("\\s" , "");
		
		System.out.println(result);
	}

}
