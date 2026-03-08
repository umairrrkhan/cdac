package practice;

// right aligned triangle 

public class Pattern4 {
	
	public static void main(String[] args) {
		for (int i = 1 ; i<=5 ; i++) {
			for (int j = 1 ; j<=5-i ; j++) { // this line is for the space same formula here for the both line okay .
				System.out.print(" ");
			}
			for (int k = 1 ; k<=i; k++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}

}
