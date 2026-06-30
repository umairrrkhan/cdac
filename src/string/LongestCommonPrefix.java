package string;

import java.util.Arrays;

public class LongestCommonPrefix {
	public static String version1(String [] str ) {
		if(str == null || str.length == 0 ) return "";
		
		for(int i = 0 ; i< str[0].length() ; i++) {
			char c = str[0].charAt(i);
			
			for(int j = 1; j<str.length ; j++) {
				if(i== str[j].length() || str[j].charAt(i)!=c ) {
					return str[0].substring(0,i);
				}
			}
		}
		
		return str[0];
	}
	
	// first one is vertical scan without sorting this version is sorting one 
	
	
	public static String version2(String[] str) {
		if(str == null || str.length == 0 ) return "";
		
		Arrays.sort(str);
		
		String first = str[0];
		String last = str[str.length-1 ];
		
		int i = 0 ;
		while(i < first.length() && i < last.length() && first.charAt(i)==last.charAt(i)) {
			i++;
		}
		
		return first.substring(0,i);
	}
	

}
