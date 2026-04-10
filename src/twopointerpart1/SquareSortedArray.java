package twopointerpart1;
import java.util.*;
public class SquareSortedArray {
	
	public static int [] esult(int n[]) {
		int left = 0;
		int right = n.length-1;
		int [] result = new int[n.length];
		
		int pos = n.length-1;
		while(left<= right) {
			int  leftsq= n[left]*n[left];
			int rightsq= n[right]*n[right];
			
			if(leftsq<rightsq) {
				result[pos] = rightsq;
				right--;
			}
			else {
				result[pos] = leftsq;
				left++;
			}
			
			pos--;
		}
		
		return result ;
	}
	
	
	public static void main(String args[]) {
		int m [] = {-4 , -1, 0 , 3 , 10};
		
		System.out.println(Arrays.toString(esult(m)));
		
	}

}
