package Practice;

// Write a program to calculate the sum of first 10 natural number.  


public class loop {
	
	public static void main(String[] args	) {
		
		
		int n = 10;
		int sum = 0;
		
		for (int i = 1; i<=n; i++) {
			sum+=i;
			System.out.println(sum +"+" + i);
		}
		
		
		System.out.println(sum);
	}

}
