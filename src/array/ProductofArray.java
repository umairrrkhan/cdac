package array;

public class ProductofArray {
	
	public static int [] productof(int [] arr) {
		int n = arr.length ;
		int [] result  = new int [n];
		
		result[0] = 1;
		
		for(int i = 1 ; i< arr.length ; i++) {
			result[i] = result[i-1] * arr[i-1]; 
		}
		
		int rightproduct = 1;
		
		for(int i = n-1; i>=0 ; i--) {
			result[i] = result[i]* rightproduct;
			rightproduct = rightproduct * arr[i];
		}
		
		return result;
	}

}
