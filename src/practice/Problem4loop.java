package practice;

// Write a program to print out all Armstrong numbers between 1 and 500. If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.


// its a same question but little complicated just u know formula of reverse  all matter is is reverse and for loop ;

public class Problem4loop {

	public static void main(String[] args) {
		for (int i = 1 ; i<=500 ; i++) {
			
			
			int original = i;
			int sum = 0;
			
			
			while (original  > 0 ) {
				int lastdigit  = original %10;
				int cube = lastdigit*lastdigit*lastdigit;
				sum = sum + cube;
				original = original / 10;
			}
			
			if (sum == i ) {
				System.out.println("this is armstrong " + i);
			}
			
		}
	}
}
