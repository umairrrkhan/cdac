package datasa;

import java.util.Scanner;

public class DuplicateArray {
	
	public static void main(String [] args) {
		int [] arr = new int[5];
		
		int[] gh = new int[arr.length];
		
		Input(arr);
		
		
		
		int result = sortedArray(arr);
		System.out.println("Unique count: " + result);
		print(arr , result);  
		
		
		
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
	
	
	
	public static int removedumplicate(int n[] , int g[] ) {
		int i = 0;
		
		g[0] = n[0];
		
		for ( int j = 1 ; j< n.length ; j++) {
			if ( n[j] != g[i]) {
				i++;
				g[i] = n[j];
				
			}
		}
		return i+ 1;
	}
	
	public static int sortedArray(int n[]) {
		int i = 0;
		
		for ( int j = 1 ; j< n.length ; j++) {
			if (n[j] != n[i]) {
				i++;
				n[i] = n[j];
			}
		}
		
		return i + 1;
	}
	
	public static void print(int g[] , int length) {
		for (int i = 0 ; i< g.length ; i++) {
			System.out.println(g[i]);
		}
	}

}
