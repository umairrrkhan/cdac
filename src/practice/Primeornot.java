package practice;

public class Primeornot {
	
	public static void main(String[] args) {
		int num = 10;
		
		boolean isPrime = true;
		
		if (num == 2) {
			System.out.println(isPrime);
		}
		
		for(int i = 2 ; i <= Math.sqrt(num) ; i++) { // start from 2 
			if(num% i == 0) {
				isPrime = false;
				break;
			}
		}
		
		System.out.println(num + "" + isPrime);
		
		
	}

}
