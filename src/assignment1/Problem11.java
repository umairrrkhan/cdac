package assignment1;

import java.util.Scanner;

public class Problem11 {

	public static void main(String[] args) {
		
		Scanner ui = new Scanner(System.in);
		System.out.print("enter ur salary = " );
		double salary = ui.nextDouble();
		
		Scanner i = new Scanner(System.in);
		System.out.print("enter ur experience in year only number  = " );
		int year = i.nextInt();
		
		
		if(year <2) {
			System.out.println(salary);
		}
		else if(year >=2 && year <=5) {
			double news= salary * 0.10;
			double rt = salary + news;
			System.out.println("total salary " + rt);
		}
		else if(year >5) {
			double qw= salary * 0.20;
			double rer = salary + qw;
			System.out.println("total salary " + rer);
		}
		else {
			System.out.println("error");
		}
		
	}
}
