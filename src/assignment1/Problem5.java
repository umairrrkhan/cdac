package assignment1;

import java.util.Scanner;

public class Problem5 {
	
	public static void main(String[] args) {
		
		Scanner ye = new Scanner(System.in);
		System.out.println("write the year ");
		int year = ye.nextInt();
		
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + "  is the leap year ");
		}
		
		else {
			System.out.println("not leap year");
		}
		
	}

}
