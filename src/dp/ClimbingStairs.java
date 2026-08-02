package dp;

public class ClimbingStairs {
	
	public static int result(int n ) {
		if(n<=2) return n ;
		
		int twostepbefore = 2; 
		int onestepbefore = 1;
		
		for (int currentstep = 3; currentstep <=  n ; currentstep ++) {
			int currentways = twostepbefore + onestepbefore;
			
			 twostepbefore = onestepbefore ;
			onestepbefore = currentways;
		}
		
		return onestepbefore;
	}

}
