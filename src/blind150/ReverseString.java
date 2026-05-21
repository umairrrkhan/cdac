package blind150;

public class ReverseString {
	
	public static void reverseString(String s[]) {
		int left = 0;
		int right = s.length-1;
		while(left < right) {
			String temp = s[left];
			s[left] = s[right];
			s[right] = temp;
			left++;
			right--;
		}
	}
	
	public static void main(String args[]) {
		String s[] = {"h","e","l","l","o"};
		
		reverseString(s);
		
		for(String n: s) {
			System.out.println(n);
		}
	}

}
