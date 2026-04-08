package hashMap;

import java.util.*;

public class Basicone {
	
	static final int hash(Object key) {
	    int h;
	    return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
	}
	
	public static void main(String [] args) {
		Map<Integer ,Integer>m1 = new HashMap<>();
		
		m1.put(12, 23432);
		
		m1.put(12, 234523);
		System.out.println(m1); //in duplicate only bigger value in the value will print with the key okay
		
		int h = m1.hashCode();  //calculating hash bro here
		
		System.out.println(h);
		
		
		
		// if the hash code get same like buckey get same it get collided 
		//we will use xor logic its take upperbits and mix them with lower bits 
		int size = m1.size();
		
		int index = (size-1) & h;
		
		System.out.println(index);
		
		System.out.println(m1.get(null));
		
	}

}
