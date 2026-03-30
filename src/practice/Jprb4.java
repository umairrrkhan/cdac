package practice;


class Animal{
	String name ;
	Animal(String name ){
		this.name= name;
		}
	
	void display() {
		System.out.println(this.name);
	}
	
	void sound() {
		System.out.println("animal making sound");
	}
}

class Dog extends Animal{
	Dog(String name){
		super(name);
	}
	
	void sound() {
		System.out.println("woof woof");
	}
	
	void display() {
		super.display();
	}
}

class Cat extends Animal{
	Cat(String name){
		super(name);
	}
	
	void sound() {
		System.out.println("meow ");
	}
	
	void display() {
		super.display();
	}
}

public class Jprb4 {
	
	public static void main(String[] args) {
		
//		Animal a1 = new Animal("crow");
//		Animal a2 = new Dog("dog");
//		Cat a3 = new Cat("cat");
//		a1.display();
//		a1.sound();
//		a2.sound();
//		a2.display();
//		a3.sound();
//		a3.display();
		
		Animal [] a = new Animal[3];
		a[0] = new Dog("dog");
		a[1] = new Animal("animal");
		a[2] = new Cat("cat");
		
		
		for ( int i = 0 ; i < a.length ; i++) {
			a[i].display();
			a[i].sound();
			
		}
		
	}

}
