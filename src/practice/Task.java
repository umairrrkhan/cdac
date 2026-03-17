package practice;

public class Task {
	
	public static void main(String[] args) {
		
		int number = 153;
		
		int result = isArmstrong(number);
		
		if (result == number) {
			System.out.println("this is armstrong ");
		}
		else {
			System.out.println("this is not ");
		}
		
	}
	
	public static int isArmstrong(int n) {
		
		int sum = 0;
		
		while (n > 0 ) {
			int lastdigit = n%10;
			sum = sum+lastdigit*lastdigit*lastdigit;
			n = n/10;
		}
		
		return sum ;
		
	}

}
