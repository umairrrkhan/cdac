package hashMap;

import java.util.*;

public class Xi1 {
	
	public static void main(String args[]) {
		String s = "aabcccc";
		Map<Character , Integer> freq = new HashMap<>();
		
		for (char c : s.toCharArray()) {
			freq.put(c, freq.getOrDefault(c, 0)+1);
		}
		System.out.println(freq);
	}

}
