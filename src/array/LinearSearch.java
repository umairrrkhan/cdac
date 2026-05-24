package array;

public class LinearSearch {

	public static boolean result(int num[], int target) {
		for(int i = 0 ; i < num.length ; i++) {
			if(num[i]==target) {
				return true;
			}
		}
		return false;
	}
	public static void main(String args[]) {
		LinearSearch obj = new LinearSearch();
		
		int m[] = {12,23,4,464,56,756,786,8,5};
		
		System.out.println(obj.result(m, 8));
	}
}
