package datasa;

import java.util.Scanner;

public class DuplicateArray {
	
	public static void main(String [] args) {
		int [] arr = new int[5];
		
		int[] gh = new int[arr.length];
		
		Input(arr);
		
		dublicate(arr , gh);
		print(gh);
		print(arr);
		
	}
	
	
	
	public static void Input(int n [] ) {
		Scanner io = new Scanner(System.in);
		System.out.println("enter the number");
		
		for (int i = 0 ; i< n.length ; i++) {
			n[i] = io.nextInt();
		}
	}
	
	public static void dumplicatecount(int n [] ) {
		System.out.println("duplicate found");
		boolean found = false ;
		for (int i = 0 ; i <n.length ; i++) {
			for (int j = i+1 ; j<n.length ; j++) {
				if ( n[i] == n[j]) {
					
					System.out.println(n[i]);
					
					found = true;
					
				}
			}
		}
	}
	
	public static void dublicate(int n [] , int g[]) {
		for (int i = 0 ; i< n.length ; i++) {
			for ( int j = i+1 ; j<n.length ; j++) {
				if ( n[i] != n[j]) {
				 g[i]= n[i];
				 
				}
			}
		}
	}
	
	public static void print(int g[]) {
		for (int i = 0 ; i< g.length ; i++) {
			System.out.println(g[i]);
		}
	}

}
