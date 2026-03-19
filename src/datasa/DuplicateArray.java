package datasa;

import java.util.Scanner;

public class DuplicateArray {
	
	public static void main(String [] args) {
		int [] arr = new int[5];
		
		int[] gh = new int[arr.length];
		
		Input(arr);
		
		Duplicate(arr , gh);
	}
	
	
	
	public static void Input(int n [] ) {
		Scanner io = new Scanner(System.in);
		System.out.println("enter the number");
		
		for (int i = 0 ; i< n.length ; i++) {
			n[i] = io.nextInt();
		}
	}
	
	public static void Duplicate(int n [] , int k[]) {
		for ( int i = 0 ; i< n.length ; i++) {
			for (int j  = 0 ; j< n.length ; i++) {
				if ( n[i] != n[j]) {
					k[i] = n[i];
				}
			}
		}
	}

}
