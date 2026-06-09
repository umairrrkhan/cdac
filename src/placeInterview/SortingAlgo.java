package placeInterview;

public class SortingAlgo {
	
	void bubblesort(int arr[]) {
		int n = arr.length;
		
		for(int i = 0 ; i<n-1-i ; i++) {
			boolean swapped = false;
			for(int  j = 0 ; j<n-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]= temp ;
					
					swapped = true;
				}
			}
			
			if(!swapped) break;
		}
	}
	
	void selectionsort(int arr[] ) {
		int n = arr.length ;
		
		for (int i = 0 ; i<n-1; i++) {
			int minimum = i;
			
			for(int j = i+1; j<n; j++) {
				if(arr[j]<arr[minimum]) {
					minimum = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[minimum];
			arr[minimum] = temp;
		}
	}
}
