package datasa;

import java.util.Scanner;

public class Ispalindrome {
	
	public static void main(String[] args) {
	
		Scanner io = new Scanner(System.in);
		
		System.out.println("enter the string ");
		
		String s = io.nextLine();
		
		Print(s);
		
	}
	
	public static boolean isPalindrome(String s) {
		
		int left = 0;
		int right = s.length() -1 ;
		
		while (left < right) {
			if(s.charAt(left)!= s.charAt(right)) {
				return false ;
			}
			left++;
			right--;
		}
		
		return true;	
		
	}
	
	public static void Print(String s) {
		if(isPalindrome(s)) {
			System.out.println("this is palindrome");
		}
		else {
			System.out.println("this is not");
		}
	}

}
