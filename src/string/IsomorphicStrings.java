package string;
import java.util.*;
public class IsomorphicStrings {
	
	// leetcode problem
	
//	s = "egg"
//			t = "add"

	
	public static boolean result(String s , String t ) {
		
		Map<Character , Character> sTos = new HashMap<>();
		Map<Character , Character> tTos = new HashMap<>();
		
		for(int i = 0 ; i< s.length() ; i++) {
			char charS = s.charAt(i);
			char charT = t.charAt(i);
			
			if(sTos.containsKey(charS) && sTos.get(charS) != charT) {
				return false;
			}
			
			if(tTos.containsKey(charT)&& tTos.get(charT)!= charS) {
				return false;
			}
			
			
			sTos.put(charS, charT);
			tTos.put(charT, charS);
		}
		
		return true;
	}
	
	
}
