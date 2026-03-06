package assignment3;

import java.util.Scanner;

public class Problem3 {
	
	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		
		System.out.println("write the temperature");
		double t = io.nextDouble();
		
		if(t<0) {
			System.out.println("Freezing	");
			
		
		}
		
		else if (0 <= t && t<= 30 ) {
			System.out.println("Normal	");
			
		}
		else if (t>30	){
			System.out.println("hot");
		}
	}

}
