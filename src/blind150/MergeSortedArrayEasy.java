package blind150;

public class MergeSortedArrayEasy {
	
	public static int[]  merge(int [] nums1,int [] nums2 ) {
		
		int i = 0 ;
		int j = 0 ;
		int k = 0;
		
		int result[] = new int [nums1.length +nums2.length];
		
		while(i<nums1.length && j<nums2.length) {
			if(nums1[i]<=nums2[j]) {
				result[k] = nums1[i];
				i++;
			}else {
				result[k] = nums2[j];
				j++;
			}
			
			k++;
		}
		
		while(i<nums1.length) {
			result[k] = nums1[i];
			i++;
			k++;
		}
		
		while(j<nums2.length) {
			result[k] = nums2[j];
			j++;
			k++;
		}
		
		return result;
	}

}
