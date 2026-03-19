package practice;

public class TransverseMatrix {
	
	public static void main(String [] args) {
		int [] [] original = {{ 1,2,3},
				               {4,5,6 }};
		
		
		int row = original.length;
		int col = original[0].length;
		
		int [] [] transpose = new int[col][row];
		
		for (int i = 0 ; i< row ; i++) {
			for (int j = 0 ; j<col ; j++) {
				transpose[j][i] = original[i][j];
			}
		}
		
		System.out.println("Original matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(original[i][j] + " ");
            }
            System.out.println(); // new line after each row
        }
		
        System.out.println("transpose matrix:");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
	
	
	
	

	}

}
