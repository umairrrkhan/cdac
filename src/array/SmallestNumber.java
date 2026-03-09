package array;

// well this is the smallest one 

public class SmallestNumber {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,6,7,8};
		
		int min = arr[0]; // The correct way is to start with the first element.
		
		for ( int i = 0 ; i< arr.length; i ++) {
			
		if (arr[i] < min) { // KINDA CONFUSING HERE  IM SO CONFUSE HERE 
			
			
			min = arr[i];
			
		}
			
		}
		
		System.out.println(min);
		}
	
}
