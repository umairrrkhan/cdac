package practice;

import java.util.Scanner;


public class Ap3 {
	
	public static void main(String [] args) {
		
	int [] arr = new int[6];
	
	Input(arr);
	
	Even(arr);
	Odd(arr);
	
		
	}
	
	
	public static void Input(int n[] ) {
		
		Scanner io = new Scanner(System.in );
		
		System.out.println("enter 5the number");
		
		for ( int i = 0 ; i< n.length ; i++) {
			n [i] = io.nextInt();
			
		}
	}
	
	
	
	public static void Even( int n [] ) {
		int even = 0 ;
		
		for ( int i = 0  ; i < n.length ; i++) {
			if ( n[i] % 2 == 0) {
				even++;
			}
		}
		
		System.out.println(even);
	}
	
	
	public static void Odd(int n [] ) {
		int odd = 0 ;
		
		for ( int i = 0 ; i < n.length ; i++) {
				if ( n[i] %2 != 0 ) {
					odd++;
				}
			}
		
		System.out.println(odd);
		}
	
	}


