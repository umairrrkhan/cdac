package assignment1;

import java.util.Scanner;

public class Problem5second {
	
	public static void main(String[] args) {
		
		Scanner hg = new Scanner(System.in);
		System.out.print("enter ur marks :   ");
		int marks = hg.nextInt();
		
		if (marks >=90) {
			System.out.println(marks + " grade = A");
		}
		
		else if (marks >=75 && marks <=89) {
			System.out.println(marks +  " , grade = B ");
		}
		
		else if (marks >= 50 && marks <=74 ) {
			System.out.println(marks + " , grade = C");
		}
		
		else if (marks < 50 ) {
			System.out.println(marks + " , grade = Fail ");
		}
		
		else {
			System.out.println("marks should be in number try again");
		}
	}

}
