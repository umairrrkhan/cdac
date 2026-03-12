package assignment4;

import java.util.Scanner;
import java.util.Arrays;

public class Problem11 {
	
	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		
		System.out.print("enter the first strign " );
		String str = io.nextLine();
		
		System.out.print("enter the second string " );
	
		
		String str2 = io.nextLine();
	
	    str = str.replaceAll(" ", "").toLowerCase();
	    str2 = str2.replaceAll(" ", "").toLowerCase();
	    
	    if(str.length() != str2.length()) {
	    	System.out.println("not anagram");
	    }else {
	    	char [] arr1 = str.toCharArray();
	    	char [] arr2 = str2.toCharArray();
	    	
	    	Arrays.sort(arr1);
	    	Arrays.sort(arr2);
	    	
	    	boolean isAnagram= Arrays.equals(arr1 , arr2);
	    	
	    	if(isAnagram) {
	    		System.out.println("it is ");
	    	}
	    	else {
	    		System.out.println("its not ");
	    	}
	    }

	
	}

}
