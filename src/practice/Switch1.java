package practice;

import java.util.Scanner;

public class Switch1 {
	
	public static void main(String[] args) {
		
		Scanner io = new Scanner(System.in);
		
		int a = io.nextInt();
		int b = io.nextInt();
		
		String command = io.next();
		
		switch(command){
			
			case "Add":
				System.out.println(a+b);
				break;
			
			case "Subtract" :
				System.out.println(a-b);
				break;
			case "Multiply":
				System.out.println(a*b);
				break;
				
			default :
				System.out.println("aaahshflsfdksdl");
		}
		
		io.close();
	}

}
