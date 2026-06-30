package array;

import java.util.ArrayList;
import java.util.List;

public class IntersectionofArray { //sorted
	
	public static List<Integer> result(int a1[] , int a2[]){
	int i = 0 ; 
	int j = 0;
	
	List<Integer> l = new ArrayList<>();
	while(i < a1.length && j < a2.length) {
		if(a1[i]< a2[j]) {
			i++;
		}else if (a1[i] > a2[j]) {
			j++;
		}else {
			l.add(a1[i]);
			i++;
			j++;
		}
	}
	
	return l ;
		
		
	}
	
	
}
