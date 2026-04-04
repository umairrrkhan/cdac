package arrayList;

public class MergeArray {
	
	static int[] result(int arr1[ ] , int arr2[] ) {
		
		 int n1 = arr1.length;
		 int n2 = arr2.length;
		 int[] merged = new int[n1 + n2];
		 
		 int i = 0 ;
		 int j = 0;
		 int k = 0;
		 
		 while ( i < n1 && j< n2) {
			 if(arr1[i]<=arr2[j]) {
				 merged[k] =arr1[i];
				 i++;
			 }
			 else {
				 merged[k] = arr2[j];
				 j++;
			 }
			 k++;
		 }
		 
		 
		 while(i<n1) {
			 merged[k] =arr1[i];
			 k++;
			 i++;
		 }
		 
		 while( j < n2) {
			 merged[k] = arr2[j];
			 k++;
			 j++;
		 }
		 
		 return merged;
		
	}
	
	public static void main(String args[] ) {
		
		int num1[] = {1,2,3,4,5};
		int num2[] = { 2,3,4,5,6,7,8,9};
		
		int cr [] = MergeArray.result(num1, num2);
		
		for ( int n : cr) {
			System.out.println(n);
		}
		
		
		
	}

}
