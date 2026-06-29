package array;

public class Secondlargest {

	public static int result(int num[]) {
		int max = num[0];
		int second = Integer.MIN_VALUE;
		
		for(int i = 0 ; i<num.length; i++) {
			if(num[i]>max) {
				second = max;
				max =num[i];
			}else if(num[i]>second && num[i]<max) {
				second = num[i];
			}
		}
		
		return second;
	}
	
	public static int second(int arr[]) {
		int max = arr[0];
		int second = Integer.MIN_VALUE;
		
		for(int i = 1; i< arr.length ; i++) {
			if(arr[i] > max) {
				second = max ;
				max = arr[i];
			}else if(second < arr[i] && max!= arr[i]) {
				second = arr[i];
			}
		}
		
		return second == Integer.MIN_VALUE? Integer.MIN_VALUE : second;
	}
	
	public static void reverse(int num[]) {
		for(int i = num.length-1; i>=0; i--) {
			System.out.println(num[i]);
		}
	}
	public static void main(String args[]) {
		int m [] = {1,2,3,4,5,6,7,9};
		
		System.out.println(result(m));
		
		Secondlargest obj = new Secondlargest();
		
		obj.reverse(m);
	}
}
