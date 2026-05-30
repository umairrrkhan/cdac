package array;

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
				slow++;
				arr[slow] = arr[fast];
			}
		}
		
		return slow+1 ;
	}

	public static void main(String[] args) {

		int[] g = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
		
		
		int k = result(g);

        System.out.println("Unique count  = " + k);
	}

}
