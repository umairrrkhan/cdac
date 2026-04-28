package placeInterview;

public class P2 {
    public static boolean result(String s ) {
    	String m = s.trim();
    	m = m.toLowerCase();
    	
    	char [] x = m.toCharArray();
    	
    	int left = 0;
    	int right = m.length()-1;
    	
    	while(left < right) {
    		while(left<right && !Character.isLetterOrDigit(s.charAt(left))) {
    			left++;
    		}
    		while(left<right && !Character.isLetterOrDigit(s.charAt(right))) {
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
	
	public static void main(String args[] ) {
    	System.out.println(result("race a car"));
    	System.out.println(result("A man, a plan, a canal: Panama"));
    	System.out.println(result(".,")); 
    	System.out.println(result(" ")); 
    }
}
