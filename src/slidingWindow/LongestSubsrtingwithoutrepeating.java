package slidingWindow;

import java.util.*;

public class LongestSubsrtingwithoutrepeating {
	
	static int find(String s) {
		Map<Character , Integer> map = new HashMap<>();
		
		int left = 0;
		int maxLen = 0;
		
		for ( int right = 0 ; right < s.length() ; right ++) {
			char c = s.charAt(right);
			
			if(map.containsKey(c) && map.get(c) >= left) {
								left = map.get(c)+1;
			}
			
			map.put(c,right);
			
			maxLen = Math.max(maxLen, right-left+1);
		}
		
		return maxLen;
	}
	
	
	public static void main(String [] args) {
		
		System.out.println(find("abcabcbb"));
		
	}

}
