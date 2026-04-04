package inheritenceAssignment;

abstract class Person{
	abstract void getData();
	
	static void info() {
		System.out.println("this is a person");
	}
}

interface Authenthi{
	
	static final int PASSWORD = 123;
	
	void displayData();
}

class Employee extends  Person implements Authenthi {
	
	String name ;
	int  deptNumber;
	
	Employee(String name , int deptNumber){
		this.name = name ;
		this.deptNumber = deptNumber;
		
		
	}
	@Override
	public void getData() {
		System.out.println(this.name + " : "+ this.deptNumber);
	}

	public void displayData() {
		System.out.println(this.name + " this is the data from interface " );
	}
	
}



final class Prb4 {
	
	public static void main(String args[]) {
		Employee e = new Employee("umair ", 123);
		e.getData();
		e.displayData();
		System.out.println(Authenthi.PASSWORD);
	}

}
