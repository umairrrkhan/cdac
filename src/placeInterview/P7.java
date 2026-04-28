package placeInterview;

public class P7 {
	
	public static int sequentialSearch(int[] arr ,int target) {
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] == target) {
				return i ;
			}
		}
		
		return -1;
	}
	
	public static void main(String [] args) {
		int[] numbers = {23, 5, 67, 12, 89, 45, 2};
		
		System.out.println(sequentialSearch(numbers,12));
	}

}
