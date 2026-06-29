package placeInterview;

public class Three {
	
	public static int linear(int arr[] , int target) {
		for(int i = 0 ; i< arr.length ; i++) {
			if(arr[i] == target) {
				return arr[i]; //value if index then i 
			}
		}
		
		return -1;
	}

}
