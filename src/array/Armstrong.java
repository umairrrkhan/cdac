package array;

public class Armstrong {
	
	public static boolean result(int num) {
		int original = num ;
		int temp = num;
		int sum = 0 ;
		
		int countDigit = String.valueOf(num).length();
		
		while(temp> 0 ) {
			int d = temp%10;
			sum+=(long) Math.pow(d, countDigit);
			temp/=10;
		}
		
		return sum == original;
	}

}
