package practice;

// Write program to find largest among three numbers

import java.util.Scanner;

public class Largestnumber {
	
	public static void main(String[] args) {
		
		Scanner io = new Scanner(System.in);
		
		System.out.println("first number");
		int first = io.nextInt();
		System.out.println("second numner");
		int second = io.nextInt();
		System.out.println("third numnber");
		int third = io.nextInt();
		
		if (first > second && first > third ) {
			System.out.println("this is biggest "+ first);
		}
		else if (second > first && second > third ) {
			System.out.println("this is the biggest "+ second);
		}
		else {
			System.out.println("this is the biggest "+ third);
		}
	}

}
