package placeInterview;

public class P8 {
	
	public static int binarySearch(int[] arr, int target) {
		int left = 0 ;
		int right = arr.length-1;
		
		while(left<= right) {
			int mid = left+(right-left)/2;
			
			if(arr[mid] == target) {
				return mid;
			}
			else if(arr[mid]< target) {
				left = mid + 1;
			}else {
				right = mid-1;
			}
		}
		
		return -1;
	}
	
	public static void main(String args[]) {
		int[] numbers = {2, 5, 12, 23, 45, 67, 89};
		
		System.out.println(binarySearch(numbers,23));
		
		System.out.println(binarySearch(numbers,67));
	}

}
