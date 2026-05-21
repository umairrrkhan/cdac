package blind150;

public class RemoveDuplicatesfromSortedArrayEassy2pointer {
	
	public static int  result(int arr[]) {
		int left = 0;
		
		for(int right = 1 ; right<arr.length; right++) {
			if(arr[right]!=arr[left]) {
				left++;
				arr[left] = arr[right];
			}
		}
		
		return left + 1;
	}

}
