package mySql;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.Optional;

public class SecondHighest {
	
	private int salary;
	
	public SecondHighest(int salary) {
	    this.salary = salary;
	}
	
	/*
	 * 
	 * select max(salary) as second highes_salary
	 * from employee
	 * where salary < (select max(salary) from employee)
	 * order by salary desc
	 * 
	 * 
	 * 
	 * 
	 */
	
	public int getSalary() {
		return salary;
	}
	
	public static void main(String [], args){
		
		Optional<Integer> secondhighestsalary = employee.stream()
				.map(SecondHighest::getSalary)
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst();
		
		secondhighestsalary.ifPresent(System.out::println);
		
		
	}
}
