package inheritenceAssignment;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

interface College{
	final static String collegeName = "KNIPSS";
	
	void getDetails();
	void showDetails();
	default void generalMessage() {
		System.out.println("welcome to college");
	}
}

class Teacher {
	String name ;
	String qualification;
	
	Teacher(String name , String qualification){
		this.name = name;
		this.qualification = qualification;
		
	}
	
	
}

class Department extends Teacher implements College{
	int deptNo;
	String deptName;
	
	Department(String name , String qualification , int deptNo , String deptName){
		super(name , qualification);
		this.deptNo = deptNo;
		this.deptName = deptName;
		
		 if (deptName.equals("IT dept")) {
		        this.deptNo = 10;
		    } else if (deptName.equals("Management dept")) {
		        this.deptNo = 20;
		    } else {
		        System.out.println("not a valid Record");
		    }
		
	}
	@Override
	public void getDetails() {
		System.out.println(this.name + " : " + this.deptName + ": "+ this.deptNo + " : "+this.qualification);
	}
	
	@Override
	public void showDetails() {
		System.out.println(this.name + " : " + this.deptName + ": "+ this.deptNo + " : "+this.qualification);
	}
	
	public String getCollegeName() {
		return collegeName;
	}
}



public class Prb1 {
   public static void main(String args[] ) {
	   
	   List<Department>d = Arrays.asList(
			   new Department("Umair","Ultra Phd", 133 , "IT dept"),
			   new Department("Umair Ullah ","Ultra max  PHD", 303 , "department of war of earth "),
			   new Department("Umair ullah khan","Ultra ultra ultra max PHD", 404  , "department of war of this sollar system  "),
			   new Department("gojo ","no level bcz he is the strongest", 133 , " deleting sukuna "));
	   
	   d.stream()
	   .filter(d1 -> d1.deptName.equals("IT dept"))
	   .forEach(d1 -> System.out.println(d1.name));
	   
	   
	   List<String> names = d.stream()
			    .map(dept -> dept.name)
			    .collect(Collectors.toList());
	   
	   long mgmtCount = d.stream()
			    .filter(dept -> dept.deptName.equals("Management dept"))
			    .count();
	   
	   boolean hasPhD = d.stream()
			    .anyMatch(dept -> dept.qualification.contains("PhD"));
	   
	   Map<String, List<Department>> groupByDept = d.stream()
			    .collect(Collectors.groupingBy(dept -> dept.deptName));
   }
}


