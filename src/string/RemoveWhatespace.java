package string;

public class RemoveWhatespace {
	
	public static String remoev(String s ) {
		StringBuilder sb = new StringBuilder();
		
		for(char c : s.toCharArray()) {
			if(c != ' ') { // we can ue here !chrachter.iswwhitespace(c)) sb.appendthen 
				sb.append(c);
			}
		}
		
		return sb.toString();
	}

}
