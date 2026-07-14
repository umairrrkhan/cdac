package mySql;
import java.util.*;
public class NthHigestSalary {
	
	/*
	 * SET N = N -1;
	 * 
	 * SELECT DISTINCT salary
	 * from employee
	 * order by salary desc 
	 * limit 1 offset N
	 */
	
	int id;
	int salary;
	
	NthHigestSalary(int id, int salary) {
        this.id = id;
        this.salary = salary;
    }
	
	public int getSalary() {
        return salary;
    }
	
	public static Integer getNthHighestSalary(List<NthHigestSalary> employees, int n) {

        return employees.stream()
                .map(NthHigestSalary::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(n - 1)
                .findFirst()
                .orElse(null);
    }

}
