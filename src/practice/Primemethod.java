package practice;

import java.lang.Math;

public class Primemethod {
	
	public static void main(String[] args) {
		
		int number = 7;
		
		boolean result = isprime(number);
		
		System.out.println(result);
		
		for(int i  = 2; i <= 20 ; i ++ ) {
			if(isprime(i)) {
				System.out.println(i  + " " );
			}
		}
		
	}
	
	
	public static boolean isprime(int n) {
		if(n <= 1) {
			return false;
		}
		
		for (int i = 2 ; i * i <= n ; i++) {
			if (n%i == 0) {
				return false;
			}
		}
		
		
		return true;
		
	}

}
