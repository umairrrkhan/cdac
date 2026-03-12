package assignment5;

public class Problem1 {
	
	public class Car{ 
		String make ; //these all r attributes
		String model;
		int year;
		String color;
		
		public Car() {
			make = "Unknown"; // default constructor
			model = "Unknown";
			year = 0;
			color = "Unknown";
		}
		
		// down r parameterized constructor
		
		public Car(String make , String model , int year , String color) {
			this.make = make;
			this.model = model;
			this.year = year ;
			this.color = color;
		}
		
		public void display() {
	        System.out.println("Car Details:");
	        System.out.println("Make  : " + make);
	        System.out.println("Model : " + model);
	        System.out.println("Year  : " + year);
	        System.out.println("Color : " + color);
	        System.out.println();
	    }
		
		public static void main(String[] args) {
			Car car1 = new Car();
			System.out.println("default cosntructor : ");
			car1.display();
			
			Car car2 = new Car("Toyota", "Corolla", 2022, "Red");
	        System.out.println("Parameterized Constructor:");
	        car2.display();

	        Car car3 = new Car("Honda", "Civic", 2023, "Blue");
	        car3.display();
		}
		
		
		
		
	}

}
