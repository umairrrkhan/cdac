package day1;

import java.util.Scanner;

public class Tutorialpart3 {
	
	public static void main (String [] args) {
	
	int randomnumber = (int) (Math.random() * 50);
	
	System.out.println(" the random number is " + randomnumber);
	
	if (randomnumber > 25) {
		System.out.println("the number is bigger then 25");
	}
	
	else if (randomnumber<25) {
			
			System.out.println("the number is lower then 25");
		}
	
	else if ( randomnumber == 25) {
		System.out.println("the number is equal to 25");
		
	}
	
	else {
		System.out.println("bro right in the int");
	}
	
	
	Scanner ag = new Scanner(System.in);
	
	System.out.print("what the age " );
	
	int age = ag.nextInt();
	
	if (age<=18 && age>=101) { // && mean that both condition should be true  aned also ||	OR	At least ONE condition must be TRUE	(isWeekend || isHoliday)  !	NOT	Reverses the condition (TRUE→FALSE, FALSE→TRUE)	!(age < 18)
		System.out.println("u r eligible bro ");
	}
	
	else {
		System.out.println("there is now way bro u r that lit");
	}
	
	int number = 23;
	
	if ( number % number == 0 && number %1 ==0 ) {
		System.out.println("this is actually a prime");
	}
	else {
		System.out.println("this is actually not a prime");
	}
	
	int hoe = 23;
	
	 String result = (hoe % 2==0 )? "odd":"even";
	
	System.out.println(result);
	
	}
}
