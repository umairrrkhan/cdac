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
	
	static boolean isPrime(int n) {
		if(n%2==0 || n%3==0) return false;
		if(n<=2) return false;
		
		for( int i = 4 ; i* i<= n ; i++) {
			if(n%i==0) return false;
		}
		
		return true;
	}
	
	static boolean  isArmstrong(int n ) {
		int original  = n ;
		
		int digit = String.valueOf(n).length();
		
		int sum = 0 ;
		
		while( n >0) {
			 n = n%10;
			 sum+= Math.pow(digit, n);
			 n/=10;
		}
		
		return sum== original;
	}
	
	 static int countPair(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int count = 0;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println("pair " + arr[left] + " + " + arr[right]);
                count+=1;
                left++;
                right--;
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }
        return count;
    }
	 
	 static void closestPair(int n[] ,int target) {
		 int left = 0  ; int right = n.length-1;
		 
		 int bestleft = left  ; int bestright= right;
		 
		 int closestSum = n[left] + n[right];
		 
		 while(left<right) {
			 int sum = n[left] +n[right];
			 if(Math.abs(sum-target)<Math.abs(closestSum-target)) {
				 closestSum = sum;
				 bestleft = left;
				 bestright = right;
			 }
		     if(sum<target) left++;
		     right--;
		 }
		 
	 }
	 
	 static void sortArray0(int n [] ) {
		 int left = 0;
		 int right = n.length-1;
		 
		 
		 
		 while(left < right) {
			 if(n[left] == 0) {
				 left++;
			 }
			 else if (n[right] == 1) {
				 right --;
			 }
			 else {
				 int temp = n[left];
				 n[left] = n[right];
				 n[right] = temp;
			 }
		 }
	 }
	 
	 static int[] squareArray(int[] n ) {
		 int[] result = new int[5];
		 int left = 0;
		 int right = n.length - 1;
		 int pos = n.length-1;
		 
		 while(left <= right) {
			 int leftbig = n[left]* n[left];
			 int rightbig = n[right] * n[right];
			 if(leftbig<rightbig) {
				 result[pos] = rightbig;
				 right--;
			 }
			 
			 else {
				 result[pos] = leftbig;
				 left++;
				 
			 }
			 pos--;
		 }
		 return result;
	 }
	
	public static void main(String args[]) {
		int m[] = {0,2,2,2,2,5,6};
		TwoPointerbasic.find(m);
		TwoPointerbasic.reverse(m);
		
		System.out.println(TwoPointerbasic.isPalindrome("madam"));
		
		int v = TwoPointerbasic.removeDuplicate(m);
		
		TwoPointerbasic.print(m);
		System.out.println("prime");
		TwoPointerbasic.isPrime(43);
		
		System.out.println(TwoPointerbasic.isArmstrong(111));
		System.out.println("pair");
		System.out.println(TwoPointerbasic.countPair(m, 4));
	}

}
