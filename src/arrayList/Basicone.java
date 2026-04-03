package arrayList;


import java.util.ArrayList;

public class Basicone {
	
	public static void main(String args[] ) {
		ArrayList<Integer>arr= new ArrayList<>();
		arr.add(1);
		arr.add(56);
		arr.add(1);
		arr.add(78);
		arr.add(1);
		
		System.out.println(arr.size());
		System.out.println(arr.get(0));
		arr.remove(0);
		arr.add(null);
		arr.add(1,12);
		
		arr.set
		
		System.out.println("contan her : "+ arr.contains(1));
		
		arr.remove(Integer.valueOf(13));
		
		
		arr.removeIf(n -> Integer.valueOf(56).equals(n)); 
		for (Integer i : arr) {
			System.out.println(i);
		}
		

		
		
		
		// I use ArrayList when size is unknown or changes frequently. I use arrays when size is fixed and performance/memory is critical.
		
		// int = 4 bytes. Integer = ~16-24 bytes (object header + value). Don’t use ArrayList for millions of primitives in memory-critical code.
		
	}

}
