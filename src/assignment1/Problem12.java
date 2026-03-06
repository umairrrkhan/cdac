package assignment1;

import java.util.Scanner;

public class Problem12 {
       public static void main (String[] args) {
    	   Scanner p = new Scanner(System.in);
    	   System.out.print("enter ur pin = " );
    	   int pin = p.nextInt();
    	   
    	   Scanner b = new Scanner(System.in);
    	   System.out.print("enter ur Balance = " );
    	   double balance = b.nextDouble();
    	   
    	   
    	   Scanner w = new Scanner(System.in);
    	   System.out.print("enter ur Withdraw amount = " );
    	   double withdraw = w.nextDouble();
    	   
    	   if (pin == 1234) {
    		    if (withdraw > balance) {
    		        System.out.println("Insufficient balance");

    		    } else if (balance - withdraw < 1000) {
    		        System.out.println("Minimum balance of ₹1000 must be maintained");

    		    } else {
    		        balance = balance - withdraw;
    		        System.out.println("Withdrawal successful");
    		        System.out.println("Remaining balance: ₹" + balance);
    		    }

    		} else {
    		    System.out.println("Incorrect PIN");
    		}
       }
}
