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
	
	static void reverse(int n []) {
		int left = 0;
		int right = n.length -1;
		
		while(left < right) {
			int temp = n[left];
			n[left] = n[right];
			n[right] = temp;
			
			left++;
			right--;
		}
		
		for (int x : n) {
			System.out.println(x);
		}
	}
	
	static boolean isPalindrome(String s) {
		int left = 0;
		int right= s.length()-1;
		
		while(left < right) {
			if(s.charAt(left)!= s.charAt(right)) {
				return false;
			}
			else {
				left++;
				right--;
			}
		}
		
		return true;
	}
	
	static void movedAllzero(int n[]) {
		int left = 0; // 
		
		for ( int i = 0 ; i< n.length ; i++) {
			if(n[i]!= 0) {
				int temp = n[i];
				n[i] = n[left];
				n[left] = temp;
				left++;
			}
		}
		
	}
	
	static int removeDuplicate(int n[]) {
		int left = 1;
		
		for( int i = 1 ; i< n.length ; i++) {
			if(n[i]!= n[i-1]) {
				n[left] = n[i];
				left++;
			}
		}
		return left;
		
	}
	static void print(int n[]) {
		for( int x : n) {
			System.out.println(x);
		}
	}
	
	public static void main(String args[]) {
		int m[] = {0,2,3,2,2,2,24,5,6};
		TwoPointerbasic.find(m);
		TwoPointerbasic.reverse(m);
		
		System.out.println(TwoPointerbasic.isPalindrome("madam"));
		
		int v = TwoPointerbasic.removeDuplicate(m);
		
		TwoPointerbasic.print(m);
		
		
		
	}

}
