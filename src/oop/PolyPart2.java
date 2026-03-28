package oop;



class Test{
	void sound() {
		System.out.println("meow meow");
	}
}

class Test2 extends Test{
	void sound() {
		System.out.println("crow crow ");
	}
}

public class PolyPart2 {
	
	public static void main(String [] args) {
		Test n = new Test();
		Test m = new Test2();
		n.sound();
		m.sound();
		
	}

}
