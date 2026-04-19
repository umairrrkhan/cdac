package stream;

import java.util.*;
import java.util.Collections;

import java.util.stream.*;

public class Dp3 {
	
	static void result(List<String> l1) {
		List<String > res = l1.stream()
				.map(String :: toUpperCase)
				.collect(Collectors.toList());
		System.out.println(res);
	}
	public static void main(String args[] ) {
		List<String > h = new ArrayList<>(Arrays.asList("fjslafjksaf;"));
		
		result(h);
	}
}
