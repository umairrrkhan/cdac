package assignment3;

import java.util.Scanner;

public class Problem4 {
	
	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		
		System.out.println("bro write the ur unit ");
		
		int unit = io.nextInt();
		
		if(unit <-100) {
			int h = unit*5;
			System.out.println("total electricit bill = "+h);
		}
		
		else if (unit <=199 && unit >=101	) {
			int jk = unit*7;
			System.out.println("total electricity bill = " + jk);
		}
		
		else if (unit >=200	) {
			int y = unit*10;
			System.out.println("TOTAL ELECTRICITY BILL = " + y);
			
		}
		
		else {
			System.out.println("error");
		}
	}

}
