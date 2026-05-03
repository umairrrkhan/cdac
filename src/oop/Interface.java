package oop;

interface camera{
	void takephoto();
}

interface musicPlayer{
	void play();
}

class smartPhone implements camera , musicPlayer{
	@Override
	public void takephoto() {
		System.out.println("taking photo blah blah ");
	}
	@Override
	public void play() {
		System.out.println("play play");
	}
}

public class Interface {

	public static void main(String args[]) {
		smartPhone a = new smartPhone();
		a.play();
		a.takephoto();
	}
}
