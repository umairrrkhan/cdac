package oop;


abstract class animal{
	abstract void sound();
	void sleep() {
		System.out.println("animal is sleeping");
	}
}

interface pet {
	void play();
}

interface guard{
	void protect();
}

class dog extends animal implements pet ,guard {
	@Override 
	public void sound() {
		System.out.println("dog bark");
	}
	
	@Override
	public void play() {
		System.out.println("is playinhg");
	}
	
	@Override
	public void protect() {
		System.out.println("is prteocting");
	}
}
public class Interface2 {
	
	public static void main(String args[] ) {
		dog b = new dog();
		
		b.play();
		b.sound();
		b.protect();
		b.sleep();
	}

}
