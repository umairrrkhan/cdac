package assignment2;

import java.util.Scanner;

public class Problem11 {
	
	public static void main(String [] args) {
		Scanner h = new Scanner(System.in);
		
		System.out.println("wriet number a");
		int a = h.nextInt();
		
		System.out.println("write the number b");
		
		int b = h.nextInt();
		
		System.out.println("write the number c ");
		
		int c = h.nextInt();
		
		int largest;
		
		if(a>b && a > c ) {
			
			largest = a;
			
		}
		
		else if (b>a && b >c ) {
			largest = b ;
		}
		
		else {
			largest = c ;
		}
		
		
		System.out.println("largest =  "+ largest );
		
		h.close();
	}

}
