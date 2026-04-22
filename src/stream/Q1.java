package stream;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


import java.util.*;

public class Q1 {
	
	public static List<String > topDrink(List<String> order , int k){
		if(order == null || order.isEmpty()) return Collections.emptyList();
		
		Map<String ,Long > freq = order.stream()
				.map(String :: trim)
				.map(String :: toLowerCase)
				.filter(s -> !s.isEmpty())
				.collect(Collectors.groupingBy(
						Function.identity(),
						Collectors.counting()));
		
		
		return freq.entrySet().stream()
				.sorted(
					    Map.Entry.<String, Long>comparingByValue(Comparator.reverseOrder())
					        .thenComparing(Map.Entry.comparingByKey())
					)
				.limit(k)
				.map(Map.Entry:: getKey)
				.collect(Collectors.toList());
	}
	
	public static void main(String args[] ) {
		List<String> orders = new ArrayList<>(Arrays.asList(
			    "Latte", "  espresso ", "LATTE", "Cappuccino", 
			    "espresso", "latte", "MOCHA", " ", "Espresso"
			));
		
		List<String> result = topDrink(orders , 2);
		
		for(String i : result) {
			System.out.println(i);
		}
	}
	

}
