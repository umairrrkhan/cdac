package placeInterview;

import java.util.Arrays;

public class P12 {
	
	public static void insertionsort(int [] arr) {
		for(int i = 0 ; i<arr.length ; i++) {
			int key = arr[i];
			int j = i -1;
			
			while(j>= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = key;
		}
	}
	
	public static void main(String[] args) {
		int [] m = {12, 11, 13, 5, 6};
		
		insertionsort(m);
		System.out.println(Arrays.toString(m));
	}

}
