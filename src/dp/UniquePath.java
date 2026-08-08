package dp;

public class UniquePath {
	
	
public int uniquePaths(int m, int n) {
	
	int dp[] = new int[n];
	
	for(int column = 0 ; column < n ; column++ ) {
		dp[column] = 1;
	}
	
	
	for(int row = 1 ; row< m ; row++) {
		for(int column = 1 ; column < n ; column++) {
			dp[column] = dp[column] + dp[column-1]; // top + left //1d verion 
		}
	}
	
	return dp[n-1];
        
    }

}
