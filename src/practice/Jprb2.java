package practice;

class Calculator{
	static int add(int a , int b ) {
		return a + b ;
	}
	
	static int add(int a , int b , int c ) {
		return a + b + c;
	}
	
   static double add(double a , double b ) {
	   return a + b;
   }
}

public class Jprb2 {
	
	public static void main(String [] args) {
		
		System.out.println(Calculator.add(12, 23));
		System.out.println(Calculator.add(1, 2, 4));
		System.out.println(Calculator.add(12, 34));
		
	}

}
