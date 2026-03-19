package practice;

import java.util.Scanner;

public class Ap2 {
	
	public static void main(String [] args) {
		
		
		
		int [] arr = new int[5];
		
		input(arr);
		Print(arr);
		
		int find  = FindMax(arr);
		
		System.out.println(find);
		
		int findmin = findMin(arr);
		System.out.println(findmin);
		
		
		
	}
	
	public static void input(int n [] ) {
		Scanner io = new Scanner(System.in);
		
		System.out.println("enter the number");
		
		for ( int i = 0 ; i < n.length ; i++) {
			n[i] = io.nextInt();
			
		}
		
	}
		
		
		
		public static void Print(int n []) {
			
			for ( int i = 0 ; i< n.length ; i++) {
				System.out.println(n[i]);
			}
		}
			
			
			public static int FindMax( int n [] ) {
				int max = n[0];
				
				for ( int i =  0 ; i < n.length ; i ++) {
				 if ( n[i] > max) {
					 max = n[i];
				 }
				}
				return max;
			}
			
			
			public static int findMin(int n[]) {
				int min = n[0];
				
				for ( int i = 0 ; i< n.length ; i ++ ) {
					if ( n [i] < min ) {
						min = n[i];
					}
				}
				
				return min;
			}

	}


