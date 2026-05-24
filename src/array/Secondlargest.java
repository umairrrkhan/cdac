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
	public static void main(String args[]) {
		int m [] = {1,2,3,4,5,6,7,9};
		
		System.out.println(result(m));
	}
}
