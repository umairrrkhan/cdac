package array;

public class MergeSortedArray {
	
	public static int [] result(int a1[] , int a2[]) {
		int i= 0;
		int j = 0;
		int k = 0;
		
		int result[] = new int[a1.length+a2.length];
		
		while(i<a1.length && j<a2.length) {
			if(a1[i]<=a2[j]) {
				result[k] = a1[i];
				i++;
			}else {
				result[k]=a2[j];
				j++;
			}
			
			k++;
		}
		
		while(i<a1.length) {
			result[k] = a1[i];
			i++;
			k++;
		}
		
		while(j<a2.length) {
			result[k]=a2[j];
			j++;
			k++;
		}
		
		return result;
	}
	
	
	public static void main(String args[]) {
		int num1[] = {1,3,4};
		int num2[] = {7,3,9};
		
		int j[] = result(num1,num2);
		for(int n: j) {
			System.out.println(n);
		}
		
		
	}

}
