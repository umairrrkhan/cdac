package array;

public class ContainerWithMostWater {
	
	public static int result(int arr[]) {
		int left = 0 ;
		int right = arr.length -1;
		int maxarea = 0;
		
		while(left < right ) {
			int width = right - left ;
			int height = Math.min(arr[right], arr[left]);
			maxarea = Math.max(maxarea,width * height) ;
			
			if(arr[left]<arr[right]) {
				left++;
			}else {
				right--;
			}
		}
		
		return maxarea;
	}
	
	 public static void main(String[] args) {
	        int[] arr = {1,8,6,2,5,4,8,3,7};

	        System.out.println(result(arr));
	    }
	

}
