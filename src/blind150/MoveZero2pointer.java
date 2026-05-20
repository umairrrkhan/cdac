package blind150;

public class MoveZero2pointer {
	
	public static void move(int arr[]) {
		int left = 0;
		
		for(int right  = 0 ; right<arr.length ; right++) {
			if(arr[right]!= 0) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp ;
				
				left++ ;
			}
		}
	}
	
	public static void main(String args[]) {
		
		int m[] = {0,1,0,3,12};
		move(m);
		
		for(int num : m) {
			System.out.println(num);
		}
		
	}

}
