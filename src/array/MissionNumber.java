package array;

public class MissionNumber {
	
	public static int result(int arr[]) {
		int n = arr.length;
		int xor = 0;
		
		for( int i = 0; i<=n ; i++) {
			xor^=i;
		}
		
		for (int num : arr) {
			xor^=num;
		}
		
		return xor;
		
	}
	
	public static void main(String args[]) {
		int arr[] = {1,0,3};
		
		System.out.println(result(arr));
	}

}
