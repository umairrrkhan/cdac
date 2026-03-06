package day1;

import java.util.Scanner;


public class tutorialpart2 {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("how is this number ");
		
      	/*int home = input.nextInt(); 
		
		System.out.println(home);*/
		
		if (input.hasNextInt())
			
			{ System.out.println("is the int right ");
		
		    int number1 = input.nextInt();
		    
		    System.out.print("the number is here " + number1);
		    
		    int number2= 23 + number1;
		    
		    System.out.println("the number is adding" + number1 + number2);
		    
		    System.out.println(number1 + "+" + number2 + "=" + number2 + "this is already plus one in the back ");
			}
		
		else {
			System.out.println("this is not the int bro");
			
		}
		
		// we can now use the numer+=1;
		// and now we can use the homeline -=2;
		// and here is the new thing num++; and there is mostly other thing too like the num-- ;
		
		
		int num34 = 12;
		
		System.out.println(Math.abs(num34));  // the here is the example is here is that negative number go positive okay right .
		System.out.println(Math.max(12, num34));
		System.out.println(Math.min(1, num34));
		System.out.println(Math.sqrt(num34));
		System.out.println(Math.round(12.56)); // nearest any value from anywhere
		System.out.println(Math.ceil(5.76)); // up value okay nearest one so its 6
		System.out.println(Math.floor(3.12)); // 3 here nearst bottom value
		System.out.println(Math.pow(12, num34)); // return in decimal and in double 
		System.out.println(Math.ceil(3.12));
		System.out.println(Math.PI); // 3.141592653589793
		System.out.println(Math.PI); // 3.141592653589793
		
		int randomNumber = (int)(Math.random());
		System.out.println(randomNumber);
		/*
		else if (input.hasNextBoolean())
			System.out.println(" is the boolean here ");
		
		else if (input.hasNextByte())
			System.out.println("is the byte here");
		
        else if (input.hasNextDouble())
			
			System.out.println("is the double here");
		
		
        else if (input.hasNextFloat())
			
			System.out.println("is the float right");
		
		else 
			
			System.out.println("bro right the int something here okay right");
			
			
			here is the order matter 
			
		
		*/
		
		
		
		
	}

}
