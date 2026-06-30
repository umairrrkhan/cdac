package string;

public class ToglleUppercaseLowercase {
	
	public static String toggleCaseAScii(String s) {
		StringBuilder  result = new StringBuilder();
		
		for(int i = 0 ; i<s.length(); i++) {
			char c = s.charAt(i);
			
			if( c>= 'A' && c<='Z') {
				result.append((char) (c + 32));
				
			} else if(c >= 'a' && c <= 'z') {
				result.append((char) (c-32));
				
			}else {
			
			result.append(c);
		}
		}
		
		return result.toString();
	}
}
