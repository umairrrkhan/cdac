package blind150;

public class ContainDuplicateEasy {
	
	public static boolean result(int arr[]) {
		for(int i = 0 ; i< arr.length ; i++) {
			for (int j = i+1  ; j<arr.length ; j++) {
				if (arr[i]==arr[j]) {
					return true;
			}
				
			}
			
		}
		
		return false;
	}
	
	public static void main(String args[]) {
		int m[] = {1,2,3,45,5};
		int n[] = {1,2,2,3,4,5};
		
		result(m);
		
		System.out.println(result(n));
	}

}
