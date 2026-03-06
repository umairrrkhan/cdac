package assignment2;

public class Problem15 {
	
	 public static void main(String[] args) {
	        
	        int count = 0;
	        
	        System.out.println("Even numbers:");
	        
	        for(int num = 1; num <= 20; num++) {
	            
	            if(num % 2 == 0) {  // Check if even
	                
	                if(num == 16) {
	                    System.out.println("\nReached " + num + " - Stopping!");
	                    break;  // Exit loop
	                }
	                
	                System.out.print(num + " ");
	                count++;
	            }
	        }
	        
	        System.out.println("\nTotal even numbers printed: " + count);
	    }

}
