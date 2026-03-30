package practice;


abstract class shape{
	String color ;
	
	shape(String color){
		this.color = color;
	}
	
	abstract double area();
	
	abstract double parameter();
	
	void display() {
		System.out.println(this.area() + " " + this.color);
	}
}


class Circle extends shape{
	double radius ;
	
	Circle (double radius , String color ){
		super(color);
		this.radius = radius;
	}
	
	@Override
    double area() {                        
        return 3.14 * radius * radius;
    }

    @Override
    double parameter() {                   
        return 2 * 3.14 * radius;
    }
    
    void display() {
    	super.display();
    }
	
	
}

public class Jprb5 {

	public static void main(String[] args) {
		
		Circle c1 = new Circle(12 ,"green");
		c1.area();
		c1.parameter();
		c1.display();
	}
	
}
