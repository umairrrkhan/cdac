package placeInterview;

public class Fibonacci {
	
	public static void print(int n ) {
		if( n <= 0 ) return ;
		if(n == 1 ) return;
		
		int a = 0 ; 
		int b = 1;
		
		for (int i = 2; i < n ; i++ ) {
			int next = a+b ;
			a = b ;
			b = next;
		}
	}
	
	
	public static int fibonacci(int n) {
		if(n <= 1) {
			return n ;
		}
		
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	public static int sumToN(int n ) {
		if(n== 0 ) {
			return 0;
		}
		
		return n + sumToN(n-1);
	}
	
	public static void main(String args[]) {
		
	}

}
