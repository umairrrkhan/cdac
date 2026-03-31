package oop;


interface Animal{
	void sound();
	void eat();
}


class Dog implements Animal{
	@Override
	public void sound() {
		System.out.println("woof bhav bhav");
	}
	@Override
	public void eat() {
		System.out.println("bone and non veg");
	}
}


public class InterfacePrb1 {
	
	public static void main(String [] args) {
		
		Dog d = new Dog();
		d.sound();
		
	}
}
