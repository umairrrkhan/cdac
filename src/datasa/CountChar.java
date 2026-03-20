package datasa;

public class CountChar {
	
	public static void main(String[] args) {
		
		String s = "umair khan";
		char c = 'u';
		
		int check = Check(s , c);
		System.out.println(check);
		
	}
	
	public static int Check(String s  , char c ) {
		int count = 0 ;
		for ( int i = 0 ; i< s.length() ; i++) {
			if (s.charAt(i) == c) {
				count ++ ;
			}
		}
		
		return count ;
	}

}
