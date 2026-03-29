package practice;

import java.util.*;

class ui{
	void in(int arr[]) {
		Scanner io = new Scanner(System.in);
		for ( int i = 0 ; i< arr.length; i++) {
			System.out.println("print ");
			arr[i] = io.nextInt();
		}
	}

	void print(int arr[] ) {
		for ( int i = 0 ; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}


public class Input {
	
	public static void main(String[] args) {
		
		ui u = new ui();
		
		int a [] = new int[6];
		u.in(a);
		u.print(a);
		
	}

}
