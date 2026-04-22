package datasa;

public class Uniquefirst {
	
	public static int first(String s ) {
		if(s == null || s.isEmpty()) return -1 ;
		
		int [] freq = new int [26];
		
		for ( int i = 0 ; i< s.length() ; i ++ ) {
			freq[s.charAt(i) - 'a']++;
		}
		
		for( int i = 0 ; i < s.length() ; i++ ) {
			if(freq [s.charAt(i ) - 'a']==1)
			{
				return i ;
			}
		}
		
		return -1 ; 
	}
	
	public static void main(String args[] ) {
		System.out.println(first("klsafdjdslakf"));
	}

}
