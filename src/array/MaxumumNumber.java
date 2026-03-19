package array;

public class MaxumumNumber {
	
	public static void main(String[] args) {
	
	int arr[] = {1,6,3,2,7,8,2,5,7};
	
	int max = arr[0];
	
	for (int i = 0 ; i< arr.length; i ++) {
		if (arr[i] > max) {
			max = arr[i];
		}
	}
	
	System.out.println(max);
	
	}

}
