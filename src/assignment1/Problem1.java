package assignment1;

import java.util.Scanner;

public class Problem1 {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the integer here any number but integer");
		int input = in.nextInt();
		
		if (input%2==0) {
			System.out.println("its even ");
		}
		else if (input%2!=0 ) {
			System.out.println("its a odd");
		}
		else {
			System.out.println("pls write the int");
		}
		
	}

}
