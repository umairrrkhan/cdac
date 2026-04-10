package twopointerpart1;

public class Sortarrayoneand0 {
	
	static void h(int n[]) {
		for(int b : n) {
			System.out.println(b);
		}
	}
	
	static void man(int n []) {
		int left = 0;
		int right = n.length-1;
		
		while(left <right) {
			if(n[left] == 0) {
				left++;
			}
			
			else if(n[right]==1) {
				right--;
			}
			else {
				int temp = n[left];
				n[left] = n[right];
				n[right] =temp;
				left++;
				right--;
			}
		}
		
	 
	}
	
	public static void main(String args[]) {
		
		int m [] = {1,0,1,0 ,1,0,0,0,1,0,0,1,0 };
		man(m);
		h(m);
		
	}

}
