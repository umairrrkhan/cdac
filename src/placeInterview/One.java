package placeInterview;

public class One {
	
	public static int second(int arr[]) {
		int max = arr[0];
		int second = Integer.MIN_VALUE;
		
		for(int i = 1; i< arr.length ; i++) {
			if(arr[i] > max) {
				second = max ;
				max = arr[i];
			}else if(second < arr[i] && max!= arr[i]) {
				second = arr[i];
			}
		}
		
		return second == Integer.MIN_VALUE? Integer.MIN_VALUE : second;
	}

}
