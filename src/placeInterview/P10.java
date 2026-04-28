package placeInterview;

import java.util.Arrays;

public class P10 {
	
	public static void selectionSort(int [] arr) {
		for ( int i = 0 ; i<arr.length ; i++) {
			int minIndex = i;
			
			for(int j = i+1 ;j<arr.length ; j++) {
				if(arr[j]< arr[minIndex]) {
					minIndex = j;
				}
			}
			
			 int temp = arr[minIndex];
	            arr[minIndex] = arr[i];
	            arr[i] = temp;
		}
	}
	
	public static void main(String args[]) {
		int[] m = {64, 25, 12, 22, 11};
		
		selectionSort(m);
		
		System.out.println(Arrays.toString(m));
	}

}
