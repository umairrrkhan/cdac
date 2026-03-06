package assignment2;

import java.util.Scanner;

public class Problem16 {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        // Take two double inputs
	        System.out.print("Enter first number: ");
	        double n1 = sc.nextDouble();
	        
	        System.out.print("Enter second number: ");
	        double n2 = sc.nextDouble();
	        
	        // Check if BOTH are between 0 and 1
	        boolean result = (n1 > 0 && n1 < 1) && (n2 > 0 && n2 < 1);
	        
	        // Display result
	        System.out.println("\nResult: " + result);
	        
	        // Optional: Show explanation
	        System.out.println("\n--- EXPLANATION ---");
	        System.out.println("First number (" + n1 + ") is >0 and <1: " + (n1 > 0 && n1 < 1));
	        System.out.println("Second number (" + n2 + ") is >0 and <1: " + (n2 > 0 && n2 < 1));
	        System.out.println("Both conditions true? " + result);
	        
	        sc.close();
	    }

}
