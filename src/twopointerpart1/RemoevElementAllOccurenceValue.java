package twopointerpart1;

public class RemoevElementAllOccurenceValue {
	
	public static int  result (int n[] , int val) {
		int k = 0;
		
		for ( int i = 0 ; i < n.length ; i++) {
			if(n[i]!= val) {
				n[k] = n[i];
				k++;
			}
		}
		
		return k ;
	}
	
	public static void main(String args[] ) {
		int m[] = {3,2,23};
		System.out.println(result(m , 3));
	}

}
