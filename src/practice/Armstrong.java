package practice;

public class Armstrong {
	
	public static void main(String[] args) {
		
		for (int i = 1; i<= 500 ; i++) {
			int num = i ;
			int sum = 0 ;
			while (num >0 ) {// we r using the while bcz of its breaking ability 
				int digit = num % 10;
				sum = sum + (digit*digit*digit);
				num = num/10;
			}
			
			if(sum == i) {
				System.out.println(i);
			}
		}
	}

}
