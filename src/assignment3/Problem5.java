package assignment3;

import java.util.Scanner;
public class Problem5 {
	
	public static void main(String[] args) {
	
	Scanner o = new Scanner(System.in);
	
	System.out.print("a score = ");

	
	int a = o.nextInt();
	System.out.print("b score = ");
	int b = o.nextInt();
	
	if (a>b	) {
		System.out.println("a win");
		if (a-b >=50 || b-1 >= 50) {
			System.out.println("Dominating Win");
		}
	}
	else if (b>a) {
		System.out.println("b win");
		if (a-b >=50 || b-1 >= 50) {
			System.out.println("Dominating Win");
		}
	}
	
	else {
		System.out.println("draw");
	}
	}
}
