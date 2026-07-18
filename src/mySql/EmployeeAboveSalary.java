package mySql;

public class EmployeeAboveSalary {
	
	/*
	 * select name
	 * where salary > ( select avg(salary)
	 * from employee
	 */
	
	int id;
	String name;
	double salary;
	
	Employee(int id; String name , double salary){
		this.id= id;
		this.name = name;
		this.salary = salary;
		}
	
	public double getSalary() {
		return salary;
	}
	
	public String getName() {
		return name;
	}
	
	public static void main(String ) {} , args){
		double avgSalary = employee.stream()
			  .mapToDouble(Employee::getSalary)
			  .average()
			  .orElse(0)
			  
			  employees.stream()
              .filter(e -> e.getSalary() > avgSalary)
              .map(Employee::getName)
              .forEach(System.out::println);
  
	}
}
