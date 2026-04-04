package fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Prb1 {
	
	static void countVowel(String filename) {
		int count = 0;
		try {
		File file  = new File(filename);
		
		Scanner scanner = new Scanner(file);
		
		while(scanner.hasNextLine()) {
			String line = scanner.nextLine();
			
			for ( int i = 0  ; i< line.length() ; i++) {
				char ch = Character.toLowerCase(line.charAt(i));
				
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                }
			}
		}
		scanner.close();
        System.out.println("Total Vowels: " + count);
		} catch (FileNotFoundException e ) {
			System.out.println("error fiel not found");
		}
	}
	
	
	public static void main(String args[]) {
		Prb1.countVowel("test.txt"); // mistake i have to put the file outside this package in the root package 
	}
}
