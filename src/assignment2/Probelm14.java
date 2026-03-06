package assignment2;

import java.util.Scanner;

public class Probelm14 {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int choice;
	        
	        do {
	            System.out.println("\n1. Add");
	            System.out.println("2. Subtract");
	            System.out.println("3. Multiply");
	            System.out.println("4. Exit");
	            System.out.print("Choice: ");
	            
	            choice = sc.nextInt();
	            
	            if(choice == 1) {
	                System.out.print("Enter two numbers: ");
	                int x = sc.nextInt();
	                int y = sc.nextInt();
	                System.out.println("Sum = " + (x + y));
	            }
	            else if(choice == 2) {
	                System.out.print("Enter two numbers: ");
	                int x = sc.nextInt();
	                int y = sc.nextInt();
	                System.out.println("Difference = " + (x - y));
	            }
	            else if(choice == 3) {
	                System.out.print("Enter two numbers: ");
	                int x = sc.nextInt();
	                int y = sc.nextInt();
	                System.out.println("Product = " + (x * y));
	            }
	            else if(choice == 4) {
	                System.out.println("Goodbye!");
	            }
	            else {
	                System.out.println("Invalid choice!");
	            }
	            
	        } while(choice != 4);
	        
	        sc.close();
	    }
	
}
