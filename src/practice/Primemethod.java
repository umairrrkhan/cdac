package practice;

public class Primemethod {
	
	public static void main(String[] args) {
		
		int number = 7;
		
		boolean result = isprime(number);
		
		System.out.println(result);
		
	}
	
	
	public static boolean isprime(int n) {
		if(n <= 1) {
			System.out.println("this is not prime");
		}
		
		for (int i = 2 ; i< n ; i++) {
			if (n%i == 0) {
				return false;
			}
		}
		
		
		return true;
		
	}

}
