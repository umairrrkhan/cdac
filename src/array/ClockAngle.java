package array;

public class ClockAngle {
	
	public static double findAngle(int hours , int minutes ) {
		if(hours < 0 || hours > 23 || minutes < 0 || minutes >59) {
			throw new IllegalArgumentException ("invalid exception");
		}
		
		double hourAngle = (hours %12) * 30 + minutes * 0.5;
		
		double minuteAngle = minutes* 6;
		
		double angle = Math.abs(hourAngle - minuteAngle);
		
		if(angle > 180) {
			angle = 360 - angle;
		}
		
		return angle ;
	}

}
