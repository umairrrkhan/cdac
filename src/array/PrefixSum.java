package array;

public class PrefixSum {
	
	public int [] result(int arr[] ) {
		int prefix[] = new int [arr.length];
		
		prefix[0]  = arr[0];
		
		for(int i = 1; i <arr.length; i ++ ) {
			prefix[i]  =prefix[i-1] + arr[i];
		}
		
		return prefix;
	}
	
	public static int rangeSum(int prefix[] , int l , int r) {
		if(l==0 ) return prefix[r];
		
		return prefix[r] - prefix[l-1];
	}

}
