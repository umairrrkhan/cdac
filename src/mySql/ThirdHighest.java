package mySql;

import java.util.Comparator;

public class ThirdHighest {
	
	/*
	 *  select max(salary) 
	 *  from employee
	 *  where salary< ( select max(salary) from employee 
	 *  where salary < ( select max(salary) from employee));
	 */
	
	private String name;
	private int salary;
	
	public int getSalary() {
		return salary;
	}
	
	public static void main(String [] , args) {
		Optional<Integer> thirdHighest= employees.stream()
				.map(ThirdHighest::getSalary)
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(2)
				.findFirst();
		
		
		System.out.println(thirdHigest.orElse(null));
	}

}
