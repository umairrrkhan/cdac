package revision;
import java.util.*;
public class LeaderArray {
	
	public static List<Integer> result(int arr[]) {
		
		ArrayList<Integer> Leader = new ArrayList<>();
		for(int i= 0 ; i < arr.length ; i++) {
			boolean isLeader = true;
			for(int j = i+1; j<arr.length ; j++) {
				if(arr[j]>arr[i]) {
					isLeader = false;
					break;
				}
			}
			
			if(isLeader) {
				Leader.add(arr[i]);
			}
		}
		
		return Leader;
	}
	
	public static List<Integer> fast(int arr[]){
		List<Integer> fast = new ArrayList<>();
		int max = Integer.MIN_VALUE;
		for(int i = arr.length ; i<=0 ; i--) {
			if(arr[i]> max) {
				fast.add(arr[i]);
				max =arr[i];
			}
		}
		Collections.reverse(fast);
		return fast;
		
	}
	
	
	public static List<Integer> practice(int arr[]){
		List<Integer> tr = new ArrayList<>();
		int max = Integer.MIN_VALUE;
		
		for(int i = arr.length ; i> 0 ; i--) {
			if(arr[i]>max) {
				tr.add(arr[i]);
				max = arr[i];
			}
		}
		
		Collections.reverse(tr);
		return tr;
	}
	
	public static void main(String args[]) {
		int m[]  = {12,23,4,5,678,9};
		LeaderArray obj = new LeaderArray();
		
		
List<Integer> result = obj.result(m);
		
		for (int num : result) {
			System.out.println(num);
		}
		
	}

}
