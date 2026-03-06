package assignment2;

public class Problem5 {
	
	public static void main(String[] args) {
	for(int num= 1 ; num<=500; num++) {
		int temp = num;
		int sum = 0;
		
		while(temp>0) {
			int digit = temp % 10;
			sum = sum + (digit*digit*digit);
			temp = temp/10;
		}
		
		if(sum==num) {
			System.out.println(num);
		}
	}
	
	}

}
