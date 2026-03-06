package assignment2;

public class Problem7vi {
	
	 public static void main(String[] args) {

	        int n = 5;

	        for (int row = 0; row < n; row++) {

	            for (int col = 0; col < n - row; col++) {
	                char ch = (char) ('A' + col);
	                System.out.print(ch);
	            }

	            for (int space = 0; space < 2 * row; space++) {
	                System.out.print(" ");
	            }

	            for (int col = n - row - 1; col >= 0; col--) {
	                char ch = (char) ('A' + col);
	                System.out.print(ch);
	            }

	            System.out.println();
	        }
	    }

}
