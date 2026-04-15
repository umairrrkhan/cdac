package hashMap;

import java.util.*;

public class Xp1 {

	public static void main(String args[] ) {
		Map<String , String > io = new HashMap<>();
		
		io.put("fskfjsld" , null);
		io.put(null, "ajfsakjf");
		
		io.put(null, "jafdkjasf;");
		System.out.println(io.get(null));
	}
}
