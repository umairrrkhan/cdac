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
	
	public static void main(String args[]) {
		int m[]  = {12,23,4,5,678,9};
		LeaderArray obj = new LeaderArray();
		
		
List<Integer> result = obj.result(m);
		
		for (int num : result) {
			System.out.println(num);
		}
		
	}

}
