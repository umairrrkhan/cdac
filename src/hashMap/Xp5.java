package hashMap;

import java.util.Map;

import java.util.*;

class  LRUCache<K , V > extends LinkedHashMap<K, V > {
	private final int capacity ;
	
	public LRUCache(int capacity) {
		super(capacity , 0.75f , true);
		this.capacity = capacity;
	}
	
	@Override 
	protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
		return size()> capacity ;
	}
}

public class Xp5 {

	public static void main(String args[] ) {
		LRUCache<String, String> cache = new LRUCache<>(3);
		
		cache.put("A", "Apple");
        cache.put("B", "Banana");
        cache.put("C", "Cherry");
        System.out.println(cache);
        
        cache.get("A"); 
        
        System.out.println(cache);
        
        cache.put("D", "Dragon");
        
        System.out.println(cache);
		
		
	}
}
