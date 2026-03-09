package array;


// reversed array without the another array ; 

// lisetn here simple coding just swapping value okay one by one 
public class ReverseArraywithoutanotherarray {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,45,5,6,7};
		
		int left = 0;
		int right = arr.length-1;
		
		for (int i = 0 ; i< arr.length ; i++) {
			System.out.println("this is the array "+ arr[i]);
			
		}
		
		while (left < right) {
			
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp ;
			
			left ++;
			right--;
		}
			System.out.println("reversed array ");
			
			for (int i = 0 ; i< arr.length ; i++) {
				System.out.println(arr[i]);
			
			
		}
}
}
