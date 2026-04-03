package arrayList;


class isPalindrome1{
	static boolean print(int x) {
		
		if ( x < 0 || ( x!= 0 && x %10 == 0 )) return false ;
		
		int reverse = 0 ;
		
		while (x > reverse) {
			reverse = reverse * 10 + x% 10 ;
			x/= 10;
		}
		
		return x == reverse || x == reverse / 10 ;
		
	}
	
	
	static int print1(int x ) {
		int reverse  = 0 ;
		int orginal = x;
		
		while ( x > 0 ) {
			int lastDigit = x % 10 ;
			reverse = reverse *10 + lastDigit;
			x/=10;
		}
		
		return reverse ;
	}
}
public class IsPalindrome {

	
	public static void main(String [] args) {
		isPalindrome1 p = new isPalindrome1();
	    System.out.println(p.print(121));
	    System.out.println(p.print1(121));
	
	}
}
