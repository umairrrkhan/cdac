package practice;
import java.util.*;
public class Pre1 {
	
	public static int  problem1(int n [] ) {
		int xor = 0;
		
		int m = n.length;
		
		for(int i = 0 ; i<=m ; i++) {
			xor^=i;
		}
		
		for(int d : n) {
			xor^=d ;
		}
		
		return xor ;
	}
	
	
	public Map<Character , Integer> freqChrachter(String s ){
		Map<Character , Integer> freq = new LinkedHashMap<>();
		
		for(char c : s.toCharArray()) {
			freq.put(c, freq.getOrDefault(c, 0)+1);
		}
		
		return freq;
	}

}
