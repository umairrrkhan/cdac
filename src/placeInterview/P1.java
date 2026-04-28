package placeInterview;

public class P1 {
	
	public static void result(String s) {
		
		char[] m= s.toCharArray();
		int left = 0;
		int right = s.length()-1;
		while(left< right) {
			char temp = m[left];
			m[left] = m[right];
			m[right] = temp;
			
			left++;
			right--;
		}
		
		System.out.println(m);
	}
	
	public static void main(String args[] ) {
		result("umair");
	}

}
