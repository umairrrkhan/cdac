package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
public class ConcurrentModificationException {
	
	public static void main(String args[]) {
		
		List<String> words = new ArrayList<>();
		words.add("apple");
		words.add("banana");
		words.add("cherry");
		words.add("dragonfruit");
		words.add("elderberry");
		words.add("pineapple");
		
		words.removeIf(m -> m.equals("apple"));
		
		List<String> words3 = new CopyOnWriteArrayList<>(words);
		for(String w : words3) {
			if(w.equals("banana")) {
				words3.remove(w);
			}
		}
		 System.out.println("CopyOnWrite way: " + words3);
		 
		 
		 Iterator<String> it = words.iterator();
		 while(it.hasNext()) {
			 String w = it.next();
			 if(w.contentEquals("pineapple")) {
				 it.remove();
			 }
		 }
	}

}
