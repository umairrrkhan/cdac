package hashMap;

import java.util.Set;

import java.util.HashSet;


import java.util.*;



public class Duplicate {

	public 	static List<Integer> findDuplicates(List<Integer> nums){
		Set<Integer> seen = new HashSet<>();
		Set<Integer> duplicate = new HashSet<>();
		
		for( int i : nums) {
			if(!seen.add(i)) {
				duplicate.add(i);
			}
		}
		
		return new ArrayList<>(duplicate);
	}
	public static void main(String args[] ) {
		List<Integer> u = new ArrayList<>(Arrays.asList(1,2,3,4,5,7,232,2,3,4,3,3,2,2,2));
		List<Integer> duplicates = findDuplicates(u);
		
		
		for( int i : duplicates) {
			System.out.println(i);
		}
	}
}
