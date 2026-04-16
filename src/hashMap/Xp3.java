package hashMap;

import java.util.*;

public class Xp3 {
	
	public static void find(String s , Map<String , Integer> freq ) {
		for(String word : s.split(" ")) {
			freq.merge(word , 1 , Integer:: sum);
		}
	}
	
	public static void print(Map<String , Integer> freq ) {
		for(Map.Entry<String, Integer> entry: freq.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
	
	public static void main(String args[] ) {
		Map<String, Integer> freq = new HashMap<>();
		
		find("the cat and the dog and the bird", freq);
		print(freq);
		
	}

}
