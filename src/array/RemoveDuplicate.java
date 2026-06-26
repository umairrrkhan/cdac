package array;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
	
	public static int result(int[]nums) {
		int left = 0;
		for(int right = 1; right<nums.length ;right++) {
			if(nums[right]!= nums[left]) {
				left++;
				nums[left]= nums[right];
			}
		}
		
		return left+1;
	}
	
	public static int practice(int [] arr) {
		if (arr.length ==0) return 0;
		
		int slow = 0;
		for(int fast = 1; fast<arr.length ; fast++) {
			if(arr[fast] != arr[slow]) {
				arr[++slow] = arr[fast];
			}
		}
		
		return slow+1 ;
	}
	
	public static int findSingleDuplicate(int arr[]) {
		Set<Integer> set = new HashSet<>();
		
		for(int num : arr) {
			if(!set.add(num)) {
				return num;
			}
		}
		return -1;
	}
	
	public static void printDuplicate(int [] arr) {
		Set<Integer> seen = new HashSet<>();
		Set<Integer> duplicate = new HashSet<>();
		
		for (int num : arr) {
			if(!seen.add(num)) {
				duplicate.add(num);
			}
		}
		
		if (duplicate.isEmpty()) {
            System.out.println("No Duplicates");
            return;
        }

        for (int num : duplicate) {
            System.out.println(num);
        }
	}

	public static void main(String[] args) {

		int[] g = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
		
		
		int k = practice(g);

        System.out.println("Unique count  = " + k);
	}

}
