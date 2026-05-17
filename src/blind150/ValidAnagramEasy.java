package blind150;

import java.util.HashMap;
public class ValidAnagramEasy {
	
	public static boolean result1(String s, String t) {
	     if(s.length()!= t.length()) return false;
	     
	     HashMap<Character , Integer> map = new HashMap<>();
	     
	     for(char num : s.toCharArray()) {
	    	 map.put(num, map.getOrDefault(num, 0)+1);
	     }
	     
	     for(char n : t.toCharArray()) {
	    	 map.put(n, map.getOrDefault(null, 0)-1);
	     }
	     
	     for (int count : map.values()) {
	         if (count != 0) return false;
	     }
	     return true;
	     
	}
	
	public static void main(String args[]) {
		String s = "umair";
		String m = "crazy";
		System.out.println(result1(s, m));
	}

}
