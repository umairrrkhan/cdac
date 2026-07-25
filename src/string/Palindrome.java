package string;

// this is kinda easy u just need to know the formula but honestly i think critical thinking is very important and im loosing it . 

//  Valid Palindrome (LeetCode 125)


public class Palindrome {
	
	public boolean isPalindrome(String s) {
		int left = 0 ; 
		int right = s.length()-1;
		
		while(left < right) {
			while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
            left++;
        }

			while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
            right--;
        }

			if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
            return false;
        }
			left++;
			right--;
		}
		
		return true;
	}
	
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
