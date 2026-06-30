package string;

public class CheckifTwoStringisrotation {
	
	public static boolean isRotation(String s1 , String s2) {
		if(s1== null || s2 == null) return false;
		if(s1.length() != s2.length()) return false;
		if(s1.length() == 0) return true;
		
		String concatenated = s1+s1;
		
		return concatenated.contains(s2);
		
	}
}
