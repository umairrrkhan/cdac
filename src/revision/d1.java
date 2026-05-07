package revision;

import java.util.Random;
import java.util.*;

public class d1 {
	public static void main(String args[]) {
		Scanner io = new Scanner(System.in) ;
			Random random = new Random();
			
			int secretNumber = random.nextInt(100)+1;
			int attempts = 0 ;
			int guess = 0;
			
			System.out.println("It's " + (secretNumber % 2 == 0 ? "EVEN" : "ODD"));
			
			while(guess != secretNumber) {
				System.out.println("too low");
				guess = io.nextInt();
				attempts++;
				if (guess < secretNumber) {
	                System.out.println("too low! " + (Math.abs(secretNumber - guess) > 50 ? "way off!" : ""));
	            } else if (guess > secretNumber) {
	                System.out.println("too high " + (Math.abs(secretNumber - guess) > 50 ? "Not even close!" : ""));
	            } else {
	                System.out.println("u got it in " + attempts + " tries");
	                
	                if (attempts <= 3) System.out.println("good run");
	                else if (attempts <= 7) System.out.println("good job");
	                else System.out.println("You struggled, but you made it!");
	            }
	        }
			
		}
	
}
