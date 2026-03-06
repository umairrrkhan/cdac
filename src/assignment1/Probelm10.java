package assignment1;

import java.util.Scanner;

public class Probelm10 {
	
	public static void main(String[] args) {
		Scanner jk = new Scanner(System.in);
		System.out.print("whats ur age = " );
		int age = jk.nextInt();
		
		Scanner ok = new Scanner(System.in);
		System.out.print(" amount = " );
		double amount = jk.nextDouble();
		
		if (age<5) {
			
			double crazy = amount * 0;
			System.out.print("total amount =  " + crazy);
		}
		
		else if (age>= 5 && age<=18 ) {
			double price1 = amount + 100;
			System.out.println(" total price = " + price1);
		}
		else if (age>= 19 && age<=60 ) {
			double price2 = amount + 200;
			System.out.println(" total price = " + price2);
		}
		else if (age>= 61 ) {
			double price3 = amount + 150;
			System.out.println(" total price = " + price3);
		}
		else  {
			System.out.println(" error");
		}
	}

}
