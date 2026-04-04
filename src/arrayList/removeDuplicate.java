package arrayList;

public class removeDuplicate {
	static int  remove(int arr[]) {
		int i = 0 ;
		
		for ( int j = 1 ; j< arr.length ; j++) {
			if(arr[i]!= arr[j]) {
				i++;
				arr[i] = arr[j];
				
//				System.out.println(arr[i]+ " what is happening here :  "+ arr[j]);
			}
		}
		
		return i + 1;
		
		
	}
	
	public static void main(String [] args) {
		
		int nums [] = {1,1,2};
		
		removeDuplicate i = new removeDuplicate();
		
		System.out.println(i.remove(nums));
		System.out.println("jsjfla");
		
        int count = remove(nums);
        
        System.out.print("Array without duplicates: ");
        for (int k = 0; k < count; k++) {
            System.out.print(nums[k] + " ");
        }
        System.out.println();
		
	}

}
