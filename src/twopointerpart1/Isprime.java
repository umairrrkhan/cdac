package twopointerpart1;

public class Isprime {
	
	static boolean findPrime(int n ) {
		if(n == 2 || n== 3) return true;
		if(n < 2  )return false ;
		if(n% 2== 0) return false;
		
		for ( int i = 5 ; i*i<= n ; i++) {
			if( n % i == 0 ) {
				return true;
			}
		}
		
		return true;
		
		
	}
	
	public static void main(String args[] ) {
		System.out.println(findPrime(4));
	}

}
