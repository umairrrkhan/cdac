package array;


// difinition 2, 3, 5, 7, 11, and 13.


public class PrimeNumber {
	
	public static boolean result(int num) {
		if(num < 2) return false;
		
		for(int i = 2; i*i<= num ; i++) {
			if(num%i == 0) return false;
		}
		
		return true;
	}

}
