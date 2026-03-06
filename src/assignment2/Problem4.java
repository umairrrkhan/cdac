package assignment2;

import java.util.Scanner;

public class Problem4 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;  // To store user's yes/no answer
        
        System.out.println("=== SIMPLE ADDITION MACHINE ===");
        
        do {
            // Step 1: Get two numbers
            System.out.print("\nEnter first number: ");
            int num1 = sc.nextInt();
            
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();
            
            // Step 2: Calculate and show sum
            int sum = num1 + num2;
            System.out.println("Sum = " + sum);
            
            // Step 3: Ask if user wants to continue
            System.out.print("\nDo you want to add more numbers? (yes/no): ");
            choice = sc.next();  // Read user's choice
            
        } while(choice.equalsIgnoreCase("yes"));  // Continue if user says yes
        
        System.out.println("\nThanks for using! Goodbye!");
        sc.close();
    }

}




