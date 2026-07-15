package mySql;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateRecord {
	
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}

	public DuplicateRecord(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	/*
	 * select name
	 * from employee
	 * group by name 
	 * having count(*) > 1;
	 */
	
	public static void main(String [] args) {
		List<String> names = dupli.stream()
				.collect(Collectors.groupingBy(DuplicateRecord:getName , Collectors.counting())))
.entrySet()
.stream()
.filter(entry -> entry.getValue() > 1)
.map(Map.Entry::getKey)
.toList();
	}

}
