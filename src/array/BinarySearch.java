package array;

public class BinarySearch {
	
	public static boolean result(int num[] , int  target) {
		int left = 0;
		int right = num.length-1;
		while(left<= right) {
			int mid = left + (right - left )/2;
			if(num[mid]==target) {
				return true;
			}else if (num[mid]<target) {
				left = mid +1;
			}else {
				right = mid -1;
			}
		}
		
		return false;
	}
	
	public static void main(String args[]) {
		int m[] = {1,2,3,4,5,6,7,8,9};
		BinarySearch obj = new BinarySearch();
		System.out.println(obj.result(m, 0));
		
	}

}
