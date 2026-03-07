package Practice;

// Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.

import java.util.Scanner;

public class Problem2 {
       public static void main(String [] args) {
    	   
    	   Scanner io = new Scanner(System.in);
    	   
    	   System.out.print("write the number =  " );
    	   int multi = io.nextInt();
    	   
    	   for (int i = 1 ; i<=10 ; i++) {
    		   int gh = multi *i;
    		   System.out.println(multi + " * "+ i +" = " +gh );
    		   
    	   }
       }
}
