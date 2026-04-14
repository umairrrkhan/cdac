package slidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
	
	static int result(String s) {
		int left = 0;
		int maxLen = 0 ;
		
		Set<Character> seen = new HashSet<>();
		
		for( int right = 0 ; right<s.length() ; right++) {
			char current = s.charAt(right);
			
			while(seen.contains(current)) {
				seen.remove(s.charAt(left));
	            left++;
				}
			
			seen.add(current);
			maxLen = Math.max(maxLen, right - left + 1);
			}
			
		return maxLen;	
		}
	
	public static void main(String args[] ) {
	System.out.println(result("pwwkew"));	
	}

}
