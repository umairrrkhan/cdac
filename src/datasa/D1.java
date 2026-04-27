package datasa;

public class D1 {
	public static int [] find(int [] arr) {
		int xorAll = 0;
		for(int num : arr) {
			xorAll^=num;
		}
		
		int rightmostSetBit= xorAll & -xorAll;
		
		int unique = 0 , unique2 = 0;
		
		for ( int num : arr) {
			if((num& rightmostSetBit) == 0) {
				unique^= num;
			}else {
				unique2 ^= num;
			}
		}
		
		return new int[] {unique, unique2};
	}
	public static void main(String args[]) {
		int[] arr = {1, 2, 3, 2, 1, 4};
        int[] result = find(arr);
        System.out.println("unique elements: " + result[0] + ", " + result[1]);
	
        int[] arr2 = {5, 7, 5, 9, 7, 11, 12, 12};
        int[] result2 = find(arr2);
        System.out.println("unique elements: " + result2[0] + ", " + result2[1]);
	}

}
