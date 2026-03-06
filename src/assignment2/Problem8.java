package assignment2;

import java.util.Scanner;

public class Problem8 {
	
	public static void main(String [] args) {
		
		Scanner u = new Scanner(System.in);
		System.out.println("enter the number");
		
		long number = u.nextLong();
		
		int evensum = 0;
		int oddsum = 0;
		
		number = Math.abs(number);
		
		while (number >0 ) {
			
			int digit = (int) (number % 10 );
			
			if (digit %2 ==0){
				
				evensum +=digit ;
				
				System.out.println(evensum);
				
			}
			else {
				oddsum+=digit;
			}
			
			
			number = number /10;
		}
		
		System.out.println("Sum of even digits: " + evensum);
        System.out.println("Sum of odd digits: " + oddsum);
		
		
		
	}

}
