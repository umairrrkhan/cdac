package assignment2;

import java.util.Scanner;

public class Problem13 {
	
public static void main(String[] args) {
        
        System.out.println("Numbers divisible by 3:");
        for(int i = 1; i <= 100; i++) {
            if(i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
       
        System.out.println("\n\nNumbers divisible by 5:");
        for(int i = 1; i <= 100; i++) {
            if(i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n\nNumbers divisible by BOTH 3 and 5:");
        for(int i = 1; i <= 100; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
