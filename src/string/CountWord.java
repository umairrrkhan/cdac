package string;

public class CountWord {
	
	public int countWords(String s) {
		if(s == null || s.trim().isEmpty()) return 0;
		
		int count = 0;
		
		boolean inwords = false;
		
		for(char c : s.toCharArray()) {
			if(c != ' '&&!inwords) {
				count++;
				inwords = true;
			}else if(c==' ') {
				inwords = false;
			}
		}
		
		return count;
	}

}
