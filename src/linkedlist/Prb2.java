package linkedlist;

import java.util.*;


class Employee{
	private String name ;
	private double salary;
	
	Employee(String name , double salary){
		this.name = name ;
		this.salary = salary ;
	}
	
	public String getName() { return this.name ;}
	
	public double getSalary() { return this.salary;}
	
	public String toString() {
		return name + " " + salary;
	} 

}

public class Prb2 {
	
	public static void main(String [] args) {
		List<Employee> l1 = new ArrayList<>();
		
		l1.add(new Employee("umari" , 1));
		l1.add(new Employee("gojo" , 5));
		l1.add(new Employee("heor" , 3));
		l1.add(new Employee("thanos" , 3));
		l1.add(new Employee("naruto" , 4));
		
		
		l1.sort(Comparator.comparingDouble(Employee::getSalary).reversed()
				.thenComparing(Employee::getName)); // there is too many way 
		
		l1.forEach(System.out::println);

	}

}
