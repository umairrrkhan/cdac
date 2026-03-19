package stringDsa;

import java.util.Scanner;

public class Part1 {
	
	public static void main(String [] args) {
		
		String q = "hello     umair";
		
		Print(q);
		
		
	}
	
	public static void Print(String m) {
		for (int i = 0 ; i < m.length(); i++) {
			
			System.out.println(m.charAt(i));
			
		}
	}

}
