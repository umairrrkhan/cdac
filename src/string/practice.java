package string;

public class practice {
	
	public static void main(String [] args) {
		
		String c = "jfsalkfjsal";
		
		
		
		for ( int i  = 0 ; i < c.length() ; i++) {
			char s = c.charAt(i);
			System.out.println(s);
			
		}
		
		for( char j : c.toCharArray()) {
			System.out.println(j);
		}
		
	}

}
