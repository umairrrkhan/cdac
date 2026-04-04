package arrayList;

public class Mergedarray {
	    public static void main(String[] args) {
	        int[] arr1 = {2, 4, 6};
	        int size1 = 3;
	        int[] arr2 = {8, 10, 12, 14};
	        int size2 = 4;
	        
	        int merged[] = new int[size1 + size2];  
	        
	        // Copy first array
	        for (int i = 0; i < size1; i++) {       
	            merged[i] = arr1[i];
	        }
	        
	        for (int i = 0; i < size2; i++) {       
	            merged[size1 + i] = arr2[i];        
	        }
	        
	        // Print merged array
	        for (int i = 0; i < merged.length; i++) { 
	            System.out.print(merged[i] + " ");
	        }
	    }
	

}
