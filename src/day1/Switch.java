package day1;

import java.util.Scanner;

public class Switch {
	
	public static void main(String [] args ) {
		
		/*char grade = 'a';
		
		switch (grade){
		case 'a':   // char use single quote and string use double quote
			System.out.println("good");
			break;
			
		default:
			System.out.println("very hard bro ");
		}*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Food menu here ");
		System.out.println("burger ");
		System.out.println("pizza");
		System.out.println("choose any option here okay 1 and 2 ");
		
		int sc = input.nextInt();
		
		String item = "";
		int price = 0;
		
		switch(sc) {
		
		case 1:
			item = "burger";
			price = 50;
			break;
		
		case 2:
			item = "pizza";
			price = 40;
			break;
		default:
			System.out.println("bro type 1 or 2 okay ");
			input.close(); // in the big program closing the input matter okay right right now its not working that good but in big program its matter and its not even that easy its hurt so bad ookay right .
			return;
		}
		
		System.out.println("u bought "+ item + " price = "+ price);
		
		input.close();
		
		// for multiple actually for multiple choice we need the loop okay right .
		
		
		
	}

}
