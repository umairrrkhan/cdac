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
	
	
	
	public static int dpv(int n) {
		if(n <= 2){ return n ;}
		
		int dp[] = new int[n+1];
		dp[1] = 1;
		dp[2] = 2;
		
		for(int i= 3 ; i<=n ; i++) {
			dp[i]= dp[i-1] + dp[i-2];
		}
		
		return dp[n];
			
		}
		
	
}
