package arrayList;


import java.util.ArrayList;


class dsa1{
	static void twoSum(int arr[] , int target) {
		int left  = 0 ;
		int right = arr.length - 1 ;
		
		while ( left < right) {
			int sum = arr[left] + arr[right];
			if ( sum == target) {
				System.out.println(arr[left] + " + "+ arr[right]);
				break;
			}
			else if( sum< target) {
				left++;
			}
			else {
				right--;
			}
		}
		
		
	}
}
public class Prb1dsa {

	public static void main(String args[] ) {
		
		int num[] = {1,3,4,5,6,7,8,9};
		int target = 4;
		
		dsa1 r = new dsa1();
		
		
		r.twoSum(num , target);
		
	}
	
}
