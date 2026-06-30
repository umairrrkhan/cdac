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

}
