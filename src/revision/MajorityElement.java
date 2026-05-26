package revision;

public class MajorityElement {
	
	public static int result(int arr[]) {
		int candidate = arr[0];
		int count = 1;
		
		for(int i = 1 ;  i < arr.length ; i++) {
			if(count == 0) {
				candidate = arr[i];
				count = 1;
			}else if(candidate == arr[i]) {
				count++;
			}else {
				count--;
			}
		}
		
		return candidate;
		
	}
	
	public static void main(String args[]) {
		int arr[] = {1,2,3,4,1,1 ,1,1,1,1};
		
		System.out.println(result(arr));
	}

}
