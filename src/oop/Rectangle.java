package oop;


class problem1{
	int length;
	int width ;
	
	problem1(int length , int width){
		this.length = length;
		this.width = width;
	}
	int area(){
		return length*width;
	}
}

public class Rectangle {
	
	public static void main(String[] args) {
		problem1 r1 = new problem1(12 , 21);
		
		System.out.println(r1.area());
		
	}

}
