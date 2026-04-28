package placeInterview;
import java.util.*;

public class P6 {
	
	public static int result(String s ) {
		Set<Character> set = new HashSet<>();
		
		int left = 0 ;
		int maxLen = 0;
		
		for( int right = 0 ; right< s.length() ; right++) {
			char c = s.charAt(right);
			
			while(set.contains(c)) {
				set.remove(s.charAt(left));
				left++;
			}
			
			set.add(c);
			
			maxLen = Math.max(maxLen, right-left+1);
		}
		
		return maxLen;
		
	}
	
	public static void main(String args[]) {
		System.out.println(result("abcabcbb"));
	}

}
