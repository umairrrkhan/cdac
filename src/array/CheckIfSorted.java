package array;

public class CheckIfSorted {
	
	public static boolean result(int num[]) {
		for(int i = 0; i<num.length-1; i++) {
			if(num[i]>num[i+1]) {
				return  false;
			}
		}
		
		
		return true;
	}
	
	public static void main(String args[]) {
		int m[] = {1,3,4,2};
		
		System.out.println(result(m));
	}

}
