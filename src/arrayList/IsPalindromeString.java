package arrayList;


class String1{

	static boolean  print(String s) {
		
		int left = 0 ;
		int right = s.length()- 1 ;
		
		while ( left > right) {
			if ( s.charAt(left)!= s.charAt(right)) {
				return false;
			}
			left++;
			right --;
		}
		
		return true;
	}
	
}


public class IsPalindromeString {
	
	public static void main(String [] args) {
		
		String1 s = new String1();
		
		System.out.println(s.print("madam"));
	}

}
