package string;


import java.util.*;
public class FirstNonRepeatingCharachter {
	
	public static int firstUniq(String s) {
		int freq[] = new int[26];
		
		for(char c : s.toCharArray()) {
			freq[c-'a']++;
		}
		
		for(int i = 0 ; i< s.length() ; i++) {
			char c = s.charAt(i);
			if(freq[c-'a']==1) {
				return i ;
			}
		}
		
		return -1;
	}
	
	public static int firstunique(String s) {
		Map<Character, Integer> freq = new HashMap<>();
		
		for(char c : s.toCharArray()) {
			freq.put(c , freq.getOrDefault(c, 0)+1);
		}
		
		for(int i = 0 ; i < s.length() ; i++) {
			if(freq.get(s.charAt(i))==1) {
				return i ;
			}
		}
		
		return -1;
	}

}
