package array;

public class MissingNumber {
	
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
	
	public static int practice(int arr[]) {
		int n = arr.length ;
		int xor = 0;
		
		for(int i = 0 ; i <= n ; i++) { // its see the 0 to n 
			xor^=i;
		}
		
		for(int num: arr) {
			xor^=num;
		}
		
		return xor;
	}
	
	public static int better(int arr[] ) {
		int n = arr.length;
	    int xor = n;
	    
	    for(int i = 0 ; i < n ; i++) {
	    	xor^= i;
	    	xor^=arr[i];
	    }
	    
	    return xor;
	}
	
	public static void main(String args[]) {
		int arr[] = {1,0,3};
		
		System.out.println(result(arr));
	}

}
