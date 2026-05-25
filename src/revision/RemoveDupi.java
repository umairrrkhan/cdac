package revision;

public class RemoveDupi {
	
	public static int  result(int num[]) {
		int left = 0;
		
		for(int right = 1; right<num.length ; right++) {
			if(num[left]!=num[right]) {
				num[++left] = num[right];
				
			}
			
		}
		
		return left+1;
	}
	
	public static void main(String args[]) {
		int arr[] = {1,1,1,1,1,2,3,4,5,6};
		System.out.println(result(arr));
	}

}
