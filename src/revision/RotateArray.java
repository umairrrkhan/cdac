package revision;

public class RotateArray {
	
	public static void rotate(int num[] , int k ) {
		k = k%num.length ;
		
		reverse(num,0,num.length -1 );
		reverse(num, 0, k - 1);          
		reverse(num, k, num.length - 1);
	}
	
	public static void reverse(int num[] , int start , int end ) {
		
		while(start< end ) {
			int temp = num[start];
			num[start]  = num[end];
			num[end] = temp;
			start ++;
			end--;
		}
	}

}
