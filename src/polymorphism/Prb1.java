package polymorphism;

import java.util.*;

import java.util.stream.*;

abstract class Employee{
	private final String id ;
	private final String name ;
	private final double baseSalary;
	private final String department;
	
	Employee(String id , String name , double baseSalary , String department){
		this.id = id ;
		this.name = name ;
		this.baseSalary = baseSalary;
		this.department = department;
	}
	
	public String getId() { return id;}
	public  String getName() { return name; } 
	public double getBaseSalary() { return baseSalary; }
    public String getDepartment() { return department; }
    
    public abstract double calculateTotalCompensation();
    
    @Override
    public String toString() {
    	return "Name: " + name +
    	           ", Department: " + department +
    	           ", Total Compensation: " + calculateTotalCompensation();
    }
}

class Developer extends Employee{
	private final String primaryTech;
	
	public Developer(String id, String name, double baseSalary, String department, String primaryTech) {
        super(id, name, baseSalary, department);
        this.primaryTech = primaryTech;
    }
	 @Override
	    public double calculateTotalCompensation() {
	        double techBonus = List.of("Java", "Python","Umair " , "Go", "Rust", "Kotlin").contains(primaryTech)
	                ? getBaseSalary() * 0.10
	                : 0;
	        return getBaseSalary() + techBonus;
	    }
	
}

class Intern extends Employee {
    private final double monthlyStipend;

    public Intern(String id, String name, String department, double monthlyStipend) {
        super(id, name, 0.0, department); 
        this.monthlyStipend = monthlyStipend;
    }

    @Override
    public double calculateTotalCompensation() {
        return monthlyStipend;
    }
}

public class Prb1 {
	
	public static void main(String args[] ) {
		 List<Employee> workforce = List.of(
		            new Developer("D01", "Alice", 95000, "Engineering", "Java"),
		            new Developer("D02", "Bob", 88000, "Engineering", "Python"),
		            new Intern("I01", "Dave", "Engineering", 2500),
		            new Developer("D03", "Frank", 92000, "Marketing", "JavaScript")
		        );
		 
		 workforce.forEach(System.out:: println);
		 
		 List<String>high = workforce.stream()
				 .filter(emp-> emp.calculateTotalCompensation() > 100)
				 .map(Employee::getName)
				 .toList();
		 
		 
		 System.out.println(high);
	}

}
