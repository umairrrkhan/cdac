package practice;

// write a program to print prime numbers between 2 to 20.

public class Prime2 {
	
	public static void main(String [] args) {
		
		for(int num = 2 ; num <=20 ; num++) {
			
			boolean isprime = true;
			
			for(int i = 2 ; i<=Math.sqrt(num) ; i++) {
				if (num % i == 0) {
					isprime = false ;
				}
			}
			
			if(isprime==true) {
				System.out.println(isprime + "this is prime " + num);
			}
			
		}
	}

}
