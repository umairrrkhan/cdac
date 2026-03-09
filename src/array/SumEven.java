package array;

// Write a Java program to find the sum of even numbers in array


public class SumEven {
	
	public static void main(String [] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,0};
		int sum = 0 ;
		
		for (int i = 1 ; i <arr.length ; i++) {
			if(arr[i] % 2 == 0 ) {
				sum+=arr[i];
				System.out.println("number is even " + arr[i]);
			}
		}
		System.out.print("even number sum = "+ sum);
	}

}
