package assignment8;

public class Problem3 {
	
	static void result(int m ) {
		if ( m >= 0 && m<=10) {
			System.out.println("blue");
		}
		else if(m >10 && m<=20) {
			System.out.println("RED");
		}
		else if ( m> 20 && m<= 30 ) {
			System.out.println("green");
		}
		else {
			System.out.println("ajksdflsj");
		}
	}
	
	public static void main(String args[]) {
		result(12);
		
		
	}

}
