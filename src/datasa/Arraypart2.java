package datasa;

import java.util.Scanner;

public class Arraypart2 {
	
	public static void main(String[] args) {
		
		
		
		
		int arr [] = new int[10];
		
		int length = displaylength(arr);
		
		System.out.println(length);
		
		int maxnum = Max(arr);
		
		System.out.println("max num : "+ maxnum);
		
		int minnum = Min(arr);
		
		System.out.println(minnum);
		
		int sumof = sum(arr);
		System.out.println("sum of number "+ sumof);
		
		int avg = sumof / arr.length;
		
		System.out.println(avg);
		
		display();
		
		
	}
	
	
	
	
     static int  displaylength(int a[]) {
    	 
    	 for (int i = 0 ; i < a.length ; i++) {
    		 Scanner io = new Scanner(System.in);
    		 System.out.print("enter the number ");
    		 a[i] = io.nextInt();
    		 
    	 }
    	 
    	 return a.length;
		
	}
     
     public static int Max(int a[] ) {
    	 
    	int max = a[0];
    	
    	for (int i = 0 ; i< a.length ; i++) {
    		if (a[i] > max) {
    			max = a[i];
    		}
    	}
    	
    	return max;
     }
     
     public static int Min(int a[] ) {
    	 
     	int min = a[0];
     	
     	for (int i = 0 ; i< a.length ; i++) {
     		if (a[i] < min) {
     			min = a[i];
     		}
     	}
     	
     	return min;
      }
     
     public static int sum(int a[]) {
    	 int sum = 0;
    	 
    	 for (int i  = 0 ; i<a.length ; i++) {
    		 sum += a[i];
    	 }
    	 
    	 return sum ;
     }
     
     static void display() {
    	 System.out.println("end karo ");
     }

}
