package arrayList;
import java.util.*;
public class Prb12 {
	
	public static void reverseLIst(List<String> l) {
		int left = 0;
		int right = l.size()-1;
		
		while(left< right) {
			String temp = l.get(left);
			l.set(left, l.get(right));
			l.set(right, temp);
			left++;
			right--;
		}
	}
	
	public static void main(String args [] ) {
		List<String> h = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
		reverseLIst(h);
		System.out.println(h);
	}

}
