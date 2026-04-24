package assignment8;

public class Problem5 {
	
	static void result() {
		int count = 0;
		for(int i = 0 ; i <= 100 ; i+=2) {
			if(i%2 == 0) {
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	public static void main(String args[]) {
		result();
	}

}
