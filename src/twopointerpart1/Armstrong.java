package twopointerpart1;

import java.util.*;

public class Armstrong {
	
	static boolean findArmstrong(int n) {
		int original = n;
		
		int sum = 0;
		
		int count = String.valueOf(n).length();
		
		while(n>0 ) {
			int lastDigit = n%10;
			sum+= Math.pow(lastDigit, count);
			n = n/10;
		}
		
		return original == sum ; 
	}
	
	public static void main(String args[]) {
		
		System.out.println(findArmstrong(153));
		
		
		for(int i = 0 ; i <= 370 ; i++) {
			if(findArmstrong(i)) {
				System.out.println(i);
			}
		}
		
	}

}
