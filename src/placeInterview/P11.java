package placeInterview;

import java.util.Arrays;

public class P11 {
	
	public static void bubblesort(int[] arr) {
		for (int i = 0 ; i< arr.length-1 ; i++) {
			boolean swapped = false;
			
			for( int j = 0 ; j<arr.length-i-1 ; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
				}
			}
			
			if (!swapped) {
                break;
            }
		}
	}
	
	public static void main(String args[] ) {
		int [] m = {64, 34, 25, 12, 22, 11, 90};
		
		bubblesort(m);
		System.out.println(Arrays.toString(m));
	}

}
