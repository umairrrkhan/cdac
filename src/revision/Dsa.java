package revision;
import java.util.*;
public class Dsa {
	
	static void printNum(int n) {
	    if(n == 0) return;
	    System.out.print(n + " ");
	    printNum(n - 1);
	    System.out.print(n + " ");
	}

	public static void main(String args[]) {
		Stack<Integer> s = new Stack<>();
		s.push(10);
		s.push(20);
		System.out.print(s.pop());
		
		printNum(4);
		
		System.out.println(10+20+"cd"+10+20);
		
		String s1 = "hello";
		String s2 = s1.toUpperCase();
		System.out.println(s1 == s2);
	}
}
