package arrayList;

public class TwoPointerbasic {
	
	static void find(int n []) {
		int left = 0;
		int right = n.length -1 ;
		int target = 6;
		while ( left < right) {
			int sum = n[left]+ n[right];
			
			if(sum == target) {
				System.out.println(n[left] +"+"+ n[right]);
				break;
			}
			else if( sum< target) {
				left++;
			}
			else {
				right--;
			}
		
		}
	}
	
	public static void main(String args[]) {
		int m[] = {0,2,3,4,5,6};
		TwoPointerbasic.find(m);
	}

}
