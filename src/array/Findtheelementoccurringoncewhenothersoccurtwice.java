package array;

public class Findtheelementoccurringoncewhenothersoccurtwice { // Find the element occurring once when others occur twice
	
	// 136. Single Number leetcode
	public static int solxor(int arr[] ) {
		int xor = 0 ;
		
		for(int num : arr) {
			xor^= num;
		}
		
		return xor ; 
	}

}
