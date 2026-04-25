package assignment8;

import java.util.*;
public class Problem7 {
	
	static void result() {
		int sum = 0;
		
		Scanner io = new Scanner(System.in);
		
		int number = 0;
		
		while(number>=0) {
			System.out.println("enter the number");
			number = io.nextInt();
			
			if(number>0) {
				sum+=number;
			}
		}
		
		System.out.println(sum);
	}
	
	public static void main(String args[]) {
		result();
	}

}
