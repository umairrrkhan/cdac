package stringDsa;

import java.util.Scanner;

public class Part1 {
	
	public static void main(String [] args) {
		
		String q = "helloumair";
		
		Print(q);
		
		call();
		
		int count1 = length(q);
		
		System.out.println(count1);
		
		
	}
	
	public static void Print(String m) {
		for (int i = 0 ; i < m.length(); i++) {
			
			System.out.println(m.charAt(i));
			
		}
	}
	
	public static void call() {
		Scanner io = new Scanner(System.in);
		
		System.out.println("enter the string : ");
		
		for ( int i = 1 ; i< 3 ; i++) {
		
			String s = io.nextLine();
			
			System.out.println(s);
			
			
		}
		
	}
	
	public static int length(String q) {
		int count = 0 ;
		for (char c : q.toCharArray()) {
			count++;
			System.out.println(c);
		}
		return count ;
	}

}
