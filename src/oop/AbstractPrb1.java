package oop;

abstract class Vehicle {
	String brand ;
	String model ;
	int year;
	
	Vehicle(String brand , String model , int year){
		this.brand = brand ;
		this.model = model;
		this.year = year;
		
		System.out.println("ABSTRACT CONST");
	}
	
	abstract void start();
	abstract void accelerate();
	void displayInfo() {
		System.out.println(this.brand + " : " + this.model +" "+ this.year);
	}
	
	void stop() {
		System.out.println("vehicle stop ");
	}
	
	static void Startservice() {
		System.out.println("vehicle start");
	}
	
	final void horn() {
		System.out.println("Horn");
	}
	
}

class Car extends Vehicle{
	Car(String brand , String model , int year){
		super(brand , model , year);
	}
	
	@Override
	public void start() {
		System.out.println("this car is started ");
	}
	
	@Override
	public void accelerate() {
		System.out.println("the car will aceelerate from 0 to 100 in 6 second ");
	}
	
	
	
	
}

class Bike extends Vehicle{
	Bike(String brand , String model , int year){
		super(brand , model , year);
	}
	
	@Override
	public void start() {
		System.out.println("bike start here ");
	}
	
	@Override 
	public void accelerate() {
		System.out.println("bike is accelerating ");
	}
}

public class AbstractPrb1 {

	public static void main(String args[] ) {
		
		Vehicle [] a = new Vehicle[2];
		a[0] = new Car("honda" , "jlkjafk", 2003);
		a[1] = new Bike("yamaha","jlakfdj",7879);
		
		for(Vehicle m : a) {
			m.start();
			m.accelerate();
			m.displayInfo();
			m.horn();
			m.Startservice();
		}
		
	}
}
