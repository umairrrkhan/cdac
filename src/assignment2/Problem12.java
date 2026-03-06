package assignment2;

import java.util.Scanner;

public class Problem12 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		for ( int i = 101; i <=199; i++) {
			if(i%7==0) {
				 sum += i;
				 
				 System.out.println("what thinges added  "+ i);
			}
			
			
		}
		
		System.out.println(sum);
		
	}

}
