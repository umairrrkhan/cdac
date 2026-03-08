package practice;

// Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both.

public class Divisibleby35 {
	
	public static void main(String [] args) {
		for (int i = 1 ; i <=100 ; i++ ) {
			if (i%3 == 0) {
				System.out.println("divisible by 3 =  "+ i);
			}
		}
		
		for(int k = 1 ; k <=100 ; k++) {
			if (k%5==0) {
				System.out.println("divisible by 5 = " + k);
			}
		}
		
		for (int io = 1; io <= 100 ; io++) {
			if (io%3 ==0 && io%5 == 0 ) {
				System.out.println("divisible by 3 and 5 both = " + io);
			}
		}
	}

}
