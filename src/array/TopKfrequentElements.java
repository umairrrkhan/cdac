package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKfrequentElements {
	
//	347. Top K Frequent Elements
//	Solved
//	Medium
//	Topics
//	premium lock icon
//	Companies
//	Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
//
//	 
//
//	Example 1:
//
//	Input: nums = [1,1,1,2,2,3], k = 2
//
//	Output: [1,2]
	
	
	 public int[] topKFrequent(int[] nums, int k) {
		 Map<Integer , Integer> freqmap = new HashMap<>();
		 
		 for(int num : nums) {
			 freqmap.put(num, freqmap.getOrDefault(num, 0)+1);
		 }
		 
		 List<Integer > [] bucket = new List[nums.length +1];
		 
		 for(int key : freqmap.keySet()) {
			 int freq = freqmap.get(key);
			 
			 if(bucket[freq]==null) {
				 bucket[freq] = new ArrayList<>();
			 }
			 
			 bucket[freq].add(key);
		 }
		 
		 int result[] = new int [k];
		 
		 int index = 0;
		 
		 for(int i = bucket.length -1 ; i>=0 && index < k ; i--) {
			 if(bucket[i]!=null) {
				 for(int num : bucket[i]) {
					 result[index++]= num;
					 if(index == k) {
						 return result;
					 }
				 }
			 }
		 }
		 
		 return result;
	 }
//	 
//	 First, it counts how many times each number appears using a HashMap.
//
//	 Then, it places each number into an array of lists (buckets) where the index matches its frequency count.
//
//	 Finally, it scans the buckets from highest frequency to lowest and pulls out numbers until it has collected the required k most frequent ones.
//


}
