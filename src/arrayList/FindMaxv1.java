package arrayList;

public class FindMaxv1 {
	
	static int findmax(int n[]) {
		int max = n[0];
		
		for( int i = 0 ; i< n.length ; i++) {
			if(n[i]>max) {
				max = n[i];
			}
		}
		return max;
		
	}
	
	public static void main(String[] args) {
		
		
		int [] m = {1,2,7,4,5,4};
		System.out.println(FindMaxv1.findmax(m));
		
	}

}
