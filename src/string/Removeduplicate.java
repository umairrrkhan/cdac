package string;

public class Removeduplicate {
	
	public String remove(String s) {
		boolean[] seen = new boolean[256];
		StringBuilder sb = new StringBuilder();
		for(char c : s.toCharArray()) {
			if(!seen[c]) {
				seen[c] = true;
				sb.append(c);
			}
		}
		return sb.toString();
	}
	
	public static void main(String [] args) {
		Removeduplicate gh = new Removeduplicate();
		System.out.println(gh.remove("hdsajkfhjkffsakjf"));
	}

}
