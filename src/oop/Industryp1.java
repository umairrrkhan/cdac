package oop;


import java.util.*;
import java.util.stream.Collectors;

enum Department {
    ENGINEERING,
    HR,
    SALES,
    FINANCE
}

abstract class Employee implements Comparable<Employee> {

    private final int id;
    private final String name;
    private final double salary;
    private final Department department;

    public Employee(int id, String name, double salary, Department department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public abstract double calculateBonus();

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.salary, other.salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                ", bonus=" + calculateBonus() +
                '}';
    }
}

interface PerformanceReview {
    String reviewPerformance();
}

class FullTimeEmployee extends Employee implements PerformanceReview {

    public FullTimeEmployee(int id, String name, double salary, Department department) {
        super(id, name, salary, department);
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.20;
    }

    @Override
    public String reviewPerformance() {
        return getName() + " exceeds expectations";
    }
}

class ContractEmployee extends Employee implements PerformanceReview {

    public ContractEmployee(int id, String name, double salary, Department department) {
        super(id, name, salary, department);
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.10;
    }

    @Override
    public String reviewPerformance() {
        return getName() + " meets KPIs";
    }
}

class EmployeeService {

    private final List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public List<Employee> getHighSalaryEmployees(double threshold) {
        return employees.stream()
                .filter(emp -> emp.getSalary() > threshold)
                .collect(Collectors.toList());
    }

    public Map<Department, List<Employee>> groupByDepartment() {
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
    }

    public double getAverageSalary() {
        return employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0);
    }

    public Optional<Employee> getHighestPaidEmployee() {
        return employees.stream()
                .max(Comparator.comparing(Employee::getSalary));
    }

    public List<Employee> sortBySalaryDescending() {
        return employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .collect(Collectors.toList());
    }
}


public class Industryp1 {
	
	 public static void main(String[] args) {

	        EmployeeService service = new EmployeeService();

	        service.addEmployee(
	                new FullTimeEmployee(1, "Umair", 120000, Department.ENGINEERING)
	        );

	        service.addEmployee(
	                new ContractEmployee(2, "Rahul", 70000, Department.HR)
	        );

	        service.addEmployee(
	                new FullTimeEmployee(3, "Sarah", 150000, Department.ENGINEERING)
	        );

	        service.addEmployee(
	                new ContractEmployee(4, "Ali", 90000, Department.SALES)
	        );

	        System.out.println("All Employees");
	        service.getEmployees().forEach(System.out::println);

	        System.out.println();

	        System.out.println("High Salary Employees");
	        service.getHighSalaryEmployees(100000)
	                .forEach(System.out::println);

	        System.out.println();

	        System.out.println("Grouped By Department");

	        Map<Department, List<Employee>> grouped =
	                service.groupByDepartment();

	        grouped.forEach((dept, empList) -> {
	            System.out.println(dept);

	            empList.forEach(System.out::println);

	            System.out.println();
	        });

	        System.out.println("Average Salary");
	        System.out.println(service.getAverageSalary());

	        System.out.println();

	        System.out.println("Highest Paid Employee");

	        service.getHighestPaidEmployee()
	                .ifPresent(System.out::println);

	        System.out.println();

	        System.out.println("Sorted By Salary Descending");

	        service.sortBySalaryDescending()
	                .forEach(System.out::println);
	    }

}
