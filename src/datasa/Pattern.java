package datasa;

public class Pattern {
	
	public static void main(String [] args_) {
		int number ;
		
		pattern1(5);
		
		pattern2(5);
		
	}
	
	
	   static void   pattern1(int n) {
		for (int i = 1 ; i <= 5 ; i++) {
			for (int j = 1 ; j<= i ; j++) {
				System.out.print(i);
			}
			
			System.out.println();}
		}
		
		static void   pattern2(int n) {
			for (int i = 1 ; i <= 5 ; i++) {
				for (int j = 1 ; j<= i ; j++) {
					System.out.print(j);
				}
				
				System.out.println();
			}
		
		
		
		
		
		
	}

}
