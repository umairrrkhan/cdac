package string;

public class ReverseString {
	
	public static String reverseString(String s) {
		char [] c = s.toCharArray();
		int left = 0 , right = c.length-1;
		
		while(left < right) {
			char temp = c[left];
			c[left] = c[right];
			c[right] = temp;
			left++;
			right--;
		}
		
		return new String(c);
	}

}
