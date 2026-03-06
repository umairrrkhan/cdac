package assignment2;

import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		System.out.println("write the number here ");
		
		int  num = io.nextInt();
		
		int reversed = 0;
		
		
		while (num >0 ) {
			int lastdigit = num%10;
			reversed = reversed * 10 + lastdigit;
			num = num/10;
		}
		System.out.println(reversed);
		
	}

}
