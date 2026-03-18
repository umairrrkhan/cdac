package datasa;

import java.util.Scanner;

public class Arraypart1 {
	
	public static void main(String [] args) {
	
	   Scanner io = new Scanner(System.in);
	   
	   int a[] = new int[5]; // litterally forget the simple thing the syntax i will now focus on one language only .
	   
	   System.out.println(a.length);
	   
	   for (int i = 0 ; i< a.length ; i++) {
		   a[i] = io.nextInt();
		   
		   System.out.println(a[i]);
	   }
	   
	   int b [] = new int[4];
	   
	   b[0] = 1;
	   b[1] = 2;
	   
	   System.out.println(b[0]);
			   
	}
	
	
	

}
