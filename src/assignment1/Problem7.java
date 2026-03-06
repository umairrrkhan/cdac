package assignment1;

import java.util.Scanner;

public class Problem7 {
	
	public static void main(String[] args) {
		
		Scanner gh = new Scanner(System.in);
		System.out.print("Username =  ");
		String username = gh.next();
		Scanner jk = new Scanner(System.in);
		System.out.print("password  =  ");
		int password = jk.nextInt();
		
		if (username.equals("admin") && password == 1234 ) {
			System.out.println("Login Successful");
		}
		else {
			System.out.println("Invalid Username or Password");
		}
		
	}

}
