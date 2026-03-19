package datasa;

import java.util.Scanner;

public class Twosum {
	
	public static void main(String [] args) {
		
		Scanner i = new Scanner(System.in);
		
		int [] arr = new int [6];
		Input(arr);
		
		int target = i.nextInt();
		
		twoSum(arr , target);
		
	
		
		
	}
	
	public static void Input(int n [] ) {
		Scanner io = new Scanner(System.in);
		System.out.println("enter the number");
		
		for ( int i = 0 ; i<n.length ; i++) {
			n[i] = io.nextInt();
			
		}
	}
	
	public static void twoSum(int n[] , int target) {
		
		for ( int i = 0 ; i< n.length ; i++) {
			for (int j = i+1 ; j<n.length ; j++) {
				if (n[i]  + n [j] == target) {
					System.out.println("pair : " + n[i]+  " and  " + n[j]);
				}
			}
		}
		 System.out.println("No more pair found");
		
	}
	
	
	

}
