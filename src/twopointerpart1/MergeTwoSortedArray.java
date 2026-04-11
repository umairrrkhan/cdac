package twopointerpart1;

public class MergeTwoSortedArray {
	
	static void print(int n[]) {
		for ( int x : n) {
			System.out.println(x);
		}
	}

	static void merge(int nums1[] , int nums2[] , int m , int n ) {
		int i =  m-1;
		int j = n-1;
		int k  = m+n -1;
		
		while(i>=0 && j>=0) {
			if(nums1[i]<nums2[j]) {
				nums1[k]= nums2[j];
				j--;
			}
			else {
				nums1[k] = nums1[i];
				i--;
			}
			k--;
		}
		
		while(j>=0) {
			nums1[k--] = nums2[j--];
		}
	}
	public static void main(String args[] ) {
		int a[] = {1, 2, 3, 0, 0, 0};
		int b[] = {2, 5, 6};
		
		int d = 3;
		int f = 3;
		
		merge(a , b , d , f);
		print(a);
		
		
	}
}
