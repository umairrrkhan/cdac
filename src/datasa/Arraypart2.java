package datasa;

import java.util.Scanner;

public class Arraypart2 {
	
	public static void main(String[] args) {
		
		
		
		
		int arr [] = new int[5];
		
		int length = displaylength(arr);
		
		System.out.println(length);
	}
	
	
	
	
     static int  displaylength(int a[]) {
    	 
    	 for (int i = 0 ; i < a.length ; i++) {
    		 Scanner io = new Scanner(System.in);
    		 System.out.print("enter the number ");
    		 a[i] = io.nextInt();
    		 
    	 }
    	 
    	 return a.length;
		
	}

}
