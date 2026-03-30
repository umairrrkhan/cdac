package practice;

class Vehicle{
	String brand;
	int speed;
	
	Vehicle(String brand , int speed){
		this.brand = brand;
		this.speed = speed;
	}
	
	void display() {
		System.out.println(this.brand + " : "+ this.speed);
	}
}

class Car extends Vehicle{
	int door;
	
	Car(String brand , int speed , int door){
		super(brand , speed);
		setDoor(door);
	}
	
	public void setDoor(int door) {
		if (door == 4) {
			this.door = door;
		}
	}
	
	void display() {
		
		System.out.println(this.brand + " " + this.speed + " "+ this.door );
	}
	
	
}




public class Jprb3 {
	
	public static void main(String [] args) {
		
		Vehicle c1  = new Vehicle("honda",123);
		
		c1.display();
		
		Vehicle c2 = new Car("honda",123 , 4);
		c2.display();
		
		
	}

}
