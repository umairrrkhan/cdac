package assignment8;

import java.util.Scanner;

public class Problem2 {
	
	static boolean result(int m) {
		if(m%5 == 0) return true;
		
		return false;
	}
	
	public static void main(String args[] ) {
		Scanner io = new Scanner(System.in);
		
		System.out.println("enter the number :");
		int g = io.nextInt();
		
		
		System.out.println(result(g));
	}

}
