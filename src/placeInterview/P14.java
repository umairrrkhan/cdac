package placeInterview;

import java.util.List;

import java.util.*;

public class P14 {
	
	public static List<Integer> merge(List<Integer> a , List<Integer> b ){
		List<Integer> result = new LinkedList<>();
		
		int i = 0, j = 0;
		
		while (i < a.size() && j < b.size()) {
            if (a.get(i) < b.get(j)) {
                result.add(a.get(i++));
            } else {
                result.add(b.get(j++));
            }
        }
		
		 while (i < a.size()) result.add(a.get(i++));
	        while (j < b.size()) result.add(b.get(j++));
	        
	        return result;
	}
	
	public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println("merged: " + merge(list1, list2));
    }

}
