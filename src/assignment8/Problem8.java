package assignment8;

import java.util.*;

public class Problem8 {
	
	static void  result1(int num1 ,int num2) {
		
		
		
		if(num1> num2) System.out.println(num1);;
		
		if(num2> num1)System.out.println(num2);;
		
	}
	
	static void result2(int n) {
		if(n >= 0) System.out.println("its is positive");
	}
	
	static void result3(int n) {
		if(n>17) System.out.println("u r eligible for voting");
		if(n<18) System.out.println("not eligible for voting");
	}
	
	static void result4(int n) {
		if(n%2==0) System.out.println("even");
		if(n%2!=0) System.out.println("odd");
	}
	
	static void result5(int n) {
		if((n%4 == 0  && n%100 != 0) ||(n%400 ==0))System.out.println("leap year ");
	}
	
	public static void main(String args[]) {
        Scanner io = new Scanner(System.in);
		
		System.out.println("first number");
		int num1 = io.nextInt();
		
		System.out.println("second number");
		int num2 = io.nextInt();
		
		result1(num1,num2);
		result2( num1);
		result3(num1);
		result4(num1);
		result5(num1);

	}

}
