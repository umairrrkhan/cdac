package array;
import java.util.*;

public class Leaderinarray {
	public List<Integer> result(int[] num){
		List<Integer> leaders = new ArrayList<>();
		int max = Integer.MIN_VALUE;
		
		for(int i = num.length-1 ; i>=0; i--) {
			if(num[i]> max) {
				leaders.add(num[i]);
				max = num[i];
			}
		}
		
		Collections.reverse(leaders);
		return leaders;
	}
	
	public static void main(String args[]) {
		int m [] = {16, 17, 4, 3, 5, 2};
		Leaderinarray obj = new Leaderinarray();

        System.out.println(obj.result(m));
	}
}
