package hashMap;

import java.util.*;
import java.util.Map;

public class Xp4 {
	
	static void print1(Map<String ,Integer> m) {  // this is the fastest one 
		for(Map.Entry<String,Integer> entry : m.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
	
	static void print2(Map<String ,Integer> m) {
		for(String key : m.keySet()) {
			System.out.println(key + " "+ m.get(key));
		}
	}
	
	static void print3(Map<String ,Integer> m) {
		m.forEach((key,value) -> System.out.println(key+ " "+ value));
	}
	
	
	
	public static void main(String args[] ) {
		Map<String, Integer> m = new HashMap<>();
		m.put("umair",1);
		m.put("gojo",1);
		m.put("luffyr",1);
		m.put("itachi",1);
		
		print1(m);
		
		System.out.println("second ");
		print2(m);
		
		print3(m);
		
	}

}
