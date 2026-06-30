package string;

public class CompressString {
	
	public static String compress(String s ) {
		if(s == null || s.isEmpty()) return s ;
		StringBuilder result = new StringBuilder();
		
		int i = 0;
		while(i< s.length()) {
			char current = s.charAt(i);
			int count = 0;
			
			while(i<s.length() && s.charAt(i) == current) {
				count ++;
				i++;
			}
			
			result.append(current);
			if(count > 1) result.append(count);
		}
		
		return result.toString();
	}

}
