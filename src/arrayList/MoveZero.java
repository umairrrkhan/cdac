package arrayList;

public class MoveZero {
	
	static void print(int arr[]) {
		int posZero = 0;
		
		for( int i = 0 ; i< arr.length ;  i++) {
			if(arr[i]!= 0 ) {
				int temp = arr[posZero];
				arr[posZero] = arr[i];
				arr[i] = temp;
				
				posZero++;
			}
		}
		
		for(int n : arr) {
			System.out.println(n);
		}
	}

	public static void main(String[] args) {
		int a [] = {1,2,3,4,5,6,0,0,1,2,3,0,0,5,0,0,5};
		MoveZero.print(a);
		

	}

}
