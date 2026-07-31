package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class NextGreaterElement {
	
	public static int[] result(int arr[]) {
		int n = arr.length ;
		int [] ans = new int[n];
		
		for(int i = 0 ; i < n ; i ++) {
			ans[i] = -1 ;
			for(int j = i + 1 ; j < n ; j++) {
				if(arr[j]> arr[i]) {
					ans[i] = arr[j];
					break;
				}
			}
		}
		
		return ans;
	}
	
	
	
	public static int [] nextgreaterelement(int [] arr) {
		int n = arr.length ;
		 int[] answer = new int[n];

		    Deque<Integer> stack = new ArrayDeque<>();

		    for (int i = n - 1; i >= 0; i--) {

		        while (!stack.isEmpty() && stack.peek() <= arr[i]) {
		            stack.pop();
		        }

		        if (stack.isEmpty()) {
		            answer[i] = -1;
		        } else {
		            answer[i] = stack.peek();
		        }

		        stack.push(arr[i]);
		    }

		    return answer;
		}

}
