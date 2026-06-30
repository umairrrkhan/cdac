package string;

import java.util.Map;

import java.util.HashMap;

public class LongestSubstringWithoutRepeating {
	
	public static int hashVersion(String s) {
		Map<Character , Integer> map = new HashMap<>();
		
		int left = 0;
		int maxLen = 0;
		
		for(int right = 0 ; right <s.length() ; right ++ ) {
			char current = s.charAt(right);
			
			if(map.containsKey(current) && map.get(current) >= left) {
				left = map.get(current) + 1;
			}
			
			map.put(current , right);
			
			maxLen = Math.max(maxLen, right - left + 1);
		}
		
		return maxLen;
	}

}
