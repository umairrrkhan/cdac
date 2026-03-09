package string;

// this is kinda easy u just need to know the formula but honestly i think critical thinking is very important and im loosing it . 

public class Palindrome {
	
	public static void main(String[] args) {
		
		String str = "racecayr";
		
		int n = str.length();
		
		boolean isPalindrome = true;
		
		for (int i  = 0 ; i < n/2 ; i++) {
			if(str.charAt(i)!= str.charAt(n-1-i)) {
				isPalindrome = false;
			}
		}
		
		System.out.println(isPalindrome);
	}

}
