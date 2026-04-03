package stream;
import java.util.*;

import  java.util.stream.*;

class Employee{
	String name ;
	int salary;
	Employee(String name , int salary){
		this.name = name;
		this.salary = salary;
	}
	
	String getRole() { return "Genereal Employee";}
	
}

class Manager extends Employee{
	int teamSize;
	
	Manager(String name , int salary , int teamSize){
		super(name , salary);
		this.teamSize = teamSize;
	}
	
	@Override
	String getRole() { return "Manager" ;}
	
}


public class streamapiClass {
	
	public static void main(String[] args) {
		
		List<Employee> employee =  Arrays.asList(
             new Employee("umair ",123),
             new Manager("Ride" , 231,8),
             new Employee("crazy",90),
             new Manager("home",87,9));
		
		List<String> managerNames = employee.stream()
				.filter(e -> e instanceof Manager)
				.map(e->e.name)
				.collect(Collectors.toList());
		
		System.out.println(managerNames);
	}

}
