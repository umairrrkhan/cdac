package string;

public class RemoveWhatespace {
	
	public static String remoev(String s ) {
		StringBuilder sb = new StringBuilder();
		
		for(char c : s.toCharArray()) {
			if(c != ' ') {
				sb.append(c);
			}
		}
		
		return sb.toString();
	}

}
