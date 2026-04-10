package twopointerpart1;

public class IsPalindrome {
	
	static boolean findPalindrome(String s ) {
		
		String m = s.toLowerCase();
		
		int left = 0 ;
		int right = s.length()-1;
		
		while ( left < right) {
			
			if(m.charAt(left)!= m.charAt(right)) {
				return false;
			}
			
			left++;
			right--;
			
		}
		
		return true;
		
	}
	
	public static void main(String args[] ) {
		System.out.println(findPalindrome("Madam"));
	}

}
