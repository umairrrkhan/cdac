package assignment4;

import java.util.Scanner;

public class Problem6 {
	
	public static void main(String [] args) {
		Scanner io = new Scanner(System.in);
		
		System.out.print("enter teh strign : " );
		String str = io.nextLine();
		
		String upper = "";
		String lower = "";
		
		for (int i = 0 ; i < str.length() ; i ++) {
			char ch = str.charAt(i);
			
			 if(ch >= 'a' && ch <= 'z') {
	                upper = upper + (char)(ch - 32);  // 'a'=97, 'A'=65, subtract 32
	            } else {
	                upper = upper + ch;
	            }
	            
	            if(ch >= 'A' && ch <= 'Z') {
	                lower = lower + (char)(ch + 32);  // Add 32 to go from uppercase to lowercase
	            } else {
	                lower = lower + ch;
	            }
	            
	            
	            System.out.println("Original: " + str);
	            System.out.println("Uppercase: " + upper);
	            System.out.println("Lowercase: " + lower);
		}
	}

}
