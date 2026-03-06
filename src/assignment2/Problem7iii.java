package assignment2;

public class Problem7iii {
	
	public static void main(String[] args) {
        
        for(int row = 1; row <= 5; row++) {
            for(int col = 1; col <= 5 - row; col++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= 2*row-1; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }

}
