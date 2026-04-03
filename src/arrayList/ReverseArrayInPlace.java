package arrayList;

class Rev{
	static void c(int arr[]) {
		int left = 0 ;
		int right = arr.length - 1;
		
		while ( left < right ) {
			
			int temp = arr[left];
			arr[left ] = arr[right];
			arr[right] = temp;
			left++;
			right --;
		}
		
		
		for  ( int num : arr) {
			System.out.println(num);
		}
		}
}

public class ReverseArrayInPlace {

	public static void main(String [] args) {
		
		int a [] = {1,2,3,6,4,1,9,0};
		
		Rev.c(a);
		
		
		
		
		
	}
}
