package oop;

import java.util.Scanner;

class Calculator {
	int add(int a , int b ) {
		return a+ b ;
	}
	
	String print(String name) {
		return name;
	}
	
	int add(int a , int b , int c ) {
		return a + b + c;
	}
}
public class PolyPart1 {
	
	public static void main(String [] args) {
	
		Calculator c = new Calculator();
		System.out.println(c.add(12, 1, 2));
		
	}

}
