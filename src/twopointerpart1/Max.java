package twopointerpart1;

public class Max {
	
	static int  findMax(int n [] ) {
		int max = n[0];
		
		for ( int i = 0 ; i < n.length ; i++) {
			if(n[i]>max) {
				
				max = n[i];
			}
			
		}
		
		return max;
	}
	
	static int findMin(int n[]) {
int min= n[0];
		
		for ( int i = 0 ; i < n.length ; i++) {
			if(n[i]<min) {
				
				min= n[i];
			}
			
		}
		
		return min;
	}
	
	public static void main(String args[]) {
		
		int m[] = {1,2,3,54,56,76,7,7,8,9};
		
		System.out.println(findMax(m));
		
		System.out.println(findMin(m));
		
	}

}
