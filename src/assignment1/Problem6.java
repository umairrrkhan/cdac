package assignment1;


import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
    	Scanner gh = new Scanner(System.in);
    	System.out.println("write the unit");
    	int unit = gh.nextInt();
    	
    	if(unit <= 100) {
    		int ty = unit*5;
    		System.out.println(ty);
    	}
    	
    	else if (unit <=200 && unit >=101) {
    		int mn = unit*7;
    		System.out.println(mn);
    	}
    	
    	else if (unit>=300) {
    		int jk = unit*10;
    		System.out.println(jk);
    	}
    		else {
    			System.out.println("aa try again");
    		}
    	
    }
}
