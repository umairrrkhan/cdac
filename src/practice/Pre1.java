package practice;

public class Pre1 {
	
	public static int  problem1(int n [] ) {
		int xor = 0;
		
		int m = n.length;
		
		for(int i = 0 ; i<=m ; i++) {
			xor^=i;
		}
		
		for(int d : n) {
			xor^=d ;
		}
		
		return xor ;
	}

}
