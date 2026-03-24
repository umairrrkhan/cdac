package oop;



class Employee{
	String name ;
	int salary;
	
	Employee(String name , int salary){
		this.name = name ;
		this.salary = salary ;
	}
	
	
	void beforeRaise() {
		System.out.println(salary);
	}
	
	double Afterraise(double per) {
		double percentage = (per / 100) * this.salary;
		double afterraige =  percentage + this.salary;
		return afterraige;
	}
}

public class Emp {
	
	public static void main(String [] args) {
		
		Employee e1 = new Employee("umair ", 1900000);
		System.out.println(e1);
		e1.beforeRaise();
		
		System.out.println("after raise "+ e1.Afterraise(12));
	}

}
