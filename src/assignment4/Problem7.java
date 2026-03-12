package assignment4;

import java.util.Scanner;

public class Problem7 {
	
	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		
		System.out.print("enter a sentece " );
		
		String str = io.nextLine().trim();
		
		int wordCount = 0;
		
		
		if(!str.isEmpty()) {
			String [] words = str.split("\\s+");
			System.out.println(words.length);
		}else {
			System.out.println("word count is zero");
		}
	}

}
