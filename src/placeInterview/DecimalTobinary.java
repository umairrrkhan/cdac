package placeInterview;

public class DecimalTobinary {
	
	public static String decimaltobinary(int n ) {
		if (n == 0 ) return "0";
		
		StringBuilder sb = new StringBuilder();
		
		while(n > 0) {
			sb.append(n%2);
			n = n/2;
		}
		
		return sb.reverse().toString();
	}

}
