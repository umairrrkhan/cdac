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



/*
 * min cost climbing stairs 
 * 
 * 
 * class Solution {
    public int minCostClimbingStairs(int[] cost) {

        int dp[] = new int[cost.length];

        dp[0] = cost[0];
        dp[1] = cost[1];

        for(int i = 2 ; i< cost.length ; i++){
            dp[i] = cost[i]+Math.min(dp[i-1],dp[i-2]);
        }

         return Math.min(
            dp[cost.length - 1],
            dp[cost.length - 2]
        );
        
    }
}
*/
