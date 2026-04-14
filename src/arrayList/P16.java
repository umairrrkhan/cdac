package arrayList;


import java.util.*;

public class P16 {

	static List<Integer> merge(List<Integer> a ,List<Integer> b){
		int i = 0 ;
		int j = 0;
		List<Integer> result = new ArrayList<>();
		
		while(i< a.size() && j< b.size()) {
			if(a.get(i)<b.get(j)) {
				result.add(a.get(i));
				i++;
			}
			else {
				result.add(b.get(j));
				j++;
			}
		}
		
		while(i< a.size()) {
			result.add(a.get(i++));
		}
		
		while(j< b.size()) {
			result.add(b.get(j++));
		}
		
		
		return result;
		
		
	}
	
	public static void main(String args[]) {
		
		List<Integer> a = Arrays.asList(1, 4, 6);
        List<Integer> b = Arrays.asList(2, 3, 5);
        System.out.println(merge(a,b));
		
	}
}
