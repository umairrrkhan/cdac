package twopointerpart1;

public class DutchFlag {
	
	static void sortColor(int n []) {
		int low  = 0 , mid = 0 , high = n.length-1;
		
		while(mid<= high) {
			if(n[mid] == 0) {
				int tem = n[mid];
				n[mid]= n[low];
				n[low] =tem;
				low++;
				mid++;
			}
			
			else if(n[mid] ==1) {
				mid++;
			}
			else {
				int temp  = n[mid];
				n[mid]= n[high] ;
				n[high] = temp;
				high--;
			}
		}
	}
	
	static void print(int n[]) {
		for(int g : n) {
			System.out.println(g);
		}
	}
	
	public static void main(String args[]) {
		
		int m [] = {2,2,2,1,1,1,0,0,0};
		sortColor(m);
		print(m);
		
	}

}
