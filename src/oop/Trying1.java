package oop;

import java.util.Scanner;


class array{
	
	
	void input(int arr []) {
		Scanner io = new Scanner(System.in);
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " = ");
			arr[i] = io.nextInt();
		}
	}
	void print(int arr[]) {
		for ( int i = 0 ; i< arr.length ; i++) {
			System.out.println(arr[i]);
		}
	}
}

public class Trying1 {
	public static void main(String[] args) {
		array a = new array();
		int[] a1 = new int[4];
		a.input(a1);
		a.print(a1);
		
		
	}

}
