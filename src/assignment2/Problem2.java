package assignment2;

import java.util.Scanner;

public class Problem2 {
	
	public static void main(String[] args) {
		
		Scanner io = new Scanner(System.in);
		System.out.println("write the number here");
		int multi = io.nextInt();
		
		if (multi>=1 ) {
			for (int i =1 ; i <=10 ; i++) {
				int result = multi*i;
				System.out.println(multi + "*"+i+"="+result);
			}
		}
		else {
			System.out.println("write the positive integer or dont write the string its int");
		}		
	}

}
