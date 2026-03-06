package assignment1;

import java.util.Scanner;

public class Problem8 {
	
	public static void main(String[] args) {
		
		Scanner kl = new Scanner(System.in);
		System.out.print("Amount =  ");
		double amount = kl.nextDouble();
		
		if (amount <=2000) {
			System.out.println("Total amount "+   amount);
		}
		else if (amount>=2000 && amount <=5000) {
			double come = amount *0.10;
			double finalamount = amount - come;
			System.out.println("Total discount  =  "+   come);
			System.out.println("Total amount after discount "+   finalamount );
			
		}
		else if (amount >5000) {
			double io = amount*0.20;
			double finalprice = amount -io;
			System.out.println("Total discount  =  "+   io);
			System.out.println("Total amount after discountt"+   finalprice);
		}
		
	}

}
