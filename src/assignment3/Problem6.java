package assignment3;

import java.util.Scanner;

public class Problem6 {
	
	public static void main(String[] args) {
		Scanner io = new Scanner(System.in	);
		
		System.out.print("eneter ur salary = ");
		int salary = io.nextInt();
		
		System.out.println("enter the credit score");
		int credit_score  =io.nextInt();
		
		if(salary >=30000	) {
			System.out.println("eligible");
			
			 if (salary >= 50000 && credit_score >= 750) {
				System.out.println("Premium Eligible");
				
			}
		}
		
		else if (credit_score>=700	) {
			System.out.println("eligible");
			 if (salary >= 50000 && credit_score >= 750) {
				System.out.println("Premium Eligible");
				
			}
			 
			 // but there is one more way to actually to do this just put the most correct one at the top 
		}
		
		
		else {
			System.out.println("not eligible");
		}
	}

}
