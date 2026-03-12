package practice;

public class Fibonacchi_problem {
	
	public static void main(String [] args) {
	
	int a = 0 ;
	int b = 1 ;
	for (int i = 1 ; i <= 10 ; i++) {
		System.out.print(a);
		
		int c = a+b;
		a = b;
		b = c; // understand it what happening so its run till the 10 okay right 
		}
	}
}
