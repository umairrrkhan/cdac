package practice;

public class Task1 {
	
	public static void main(String [] args ) {
		int a = 131;
		
		int sum = 0;
		
		int  original = a ;
		
		while (0< a) {
			int lastdigit = a%10;
			sum = sum+ lastdigit*lastdigit*lastdigit;
			a = a/10;
		}
		
		if(original == sum) {
			System.out.println("this is armstrong");
		}
		else {
			System.out.println("this is not");
		}
	}

}
