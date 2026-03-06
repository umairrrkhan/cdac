package day1;

public class LoopTutorial {
	
	public static void main(String[] args) {
		int sum = 1;
		for(int i=1; i<=10 ; i++) {
			sum*=i;
			System.out.println(i +" = "+sum);
			
		}
		System.out.println(sum);
	}
}
