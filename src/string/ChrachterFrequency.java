package string;
import java.util.*;

public class ChrachterFrequency {
	
	public Map<Character , Integer> charFreq(String s){
		Map <Character , Integer> freq = new LinkedHashMap<>();
		for(char c : s.toCharArray()) {
			freq.put(c, freq.getOrDefault(c, 0)+1);
		}
		
		return freq;
	}

}
