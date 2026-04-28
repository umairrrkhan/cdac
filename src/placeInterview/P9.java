package placeInterview;

public class P9 {
	
	public static int recursiveLinearSearch(int [] arr, int target , int index) {
		if(index >= arr.length) {
			return -1;
		}
		
		if(arr[index] == target) {
			return index;
		}
		
		return recursiveLinearSearch(arr, target ,index+1);
	}
	
	public static int recursiveBinarySearch(int [] arr , int target , int left , int right) {
		if(left> right) {
			return -1;
		}
		
		int mid = left + (right-left)/2;
		
		if(arr[mid] == target) {
			return mid;
		}
		
		else if(arr[mid]> target) {
			return recursiveBinarySearch(arr, target , left , mid -1);
		}
		else {
			return recursiveBinarySearch(arr , target ,  mid+1,right);
		}
	}
	
	
	public static void main(String args[] ) {
		int [] m = {34, 7, 23, 89, 12, 56, 78};
		
		System.out.println(recursiveLinearSearch(m,12,0));
		
		System.out.println(recursiveBinarySearch(m , 7,0 , m.length-1));
	}

}
