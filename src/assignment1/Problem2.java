package assignment1;

import java.util.Scanner;

public class Problem2 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("bro write the ur age its should be in integer eg . 19");
		int input = in.nextInt();
		
		if(input >= 18) {
			
			System.out.println("U r eligible go vote ");
		}
		else if (input  < 18) {
			System.out.println("U r not eligible be 18 , ur age is " + input );
			
		}
		
		else {
			System.out.println("write the integer eg 18 or 19");
		}
		
		
	}

}
