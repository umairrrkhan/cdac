package array;

public class MajorityElement {
	public static int result(int [] num) {
		int candidate = num[0];
		
		int count = 1;
		
		for(int i = 1; i< num.length ; i++) {
			if(count ==0) {
				candidate=   num[i];
				count =1;
			}else if(num[i]==candidate) {
				count++;
			}else {
				count--;
			}
		}
		
		return candidate ;
	}
	
	public static void main(String args[]) {
		int  m[] = {2, 2, 1, 1, 1, 2, 1};
		
		System.out.println(result(m));
	}
}
