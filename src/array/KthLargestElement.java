package array;

import java.util.PriorityQueue;

public class KthLargestElement {
	
	
	public static int findKthLargest(int [] nums , int k ) {
	PriorityQueue<Integer> heap = new PriorityQueue<>();
	
	for(int num : nums) {
		heap.add(num);
		if(heap.size() > k ) {
			heap.poll();
		}
	}
	
	return heap.peek();
	
	}
}
