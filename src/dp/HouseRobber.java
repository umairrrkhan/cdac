package dp;

public class HouseRobber {
	
	public static int result(int nums[]) {
		int onestepback = 0;
		int twostepback = 0;
		
		for(int money : nums) {
			int robcurrent = money + twostepback;
			int skipcurrent = onestepback ;
			
			int currentbest = Math.max(robcurrent, skipcurrent);
			
			twostepback = onestepback;
			onestepback = currentbest;
			
		}
		
		
		return onestepback;
	}
}
