package assignment1;

import java.util.Scanner;

public class Problem9 {
	
	public static void main(String[] args) {
		
		Scanner jk= new Scanner(System.in);
		System.out.print("Fist subject marks = ");
		int fs=jk.nextInt();
		
		
		Scanner pk= new Scanner(System.in);
		System.out.print("Second subject marks = ");
		int ss = pk.nextInt();
		
		Scanner ok= new Scanner(System.in);
		System.out.print("Third subject marks = ");
		int ts = ok.nextInt();
		
		if(fs>=35 && ss >= 35 && ts >= 35) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}
	

}
