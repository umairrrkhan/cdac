package array;

import java.util.Scanner;

// Write a Java program to search for an element in an array

public class SearchElement {
	
	public static void main(String [] args) {
		int [] arr = {1 ,2 ,3 ,4 ,5 };
		
		Scanner io = new Scanner(System.in);
		
		System.out.println("enter the number to search the element ");
		
		int find = io.nextInt();
		
		System.out.println(arr[find]);
		
		for (int i = 0 ; i < 5 ; i++) {
			if (arr[i] == 2 ) {
				System.out.println("location " + i);
				break;
			}
		}
	}
	
	

}
