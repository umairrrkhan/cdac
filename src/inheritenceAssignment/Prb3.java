package inheritenceAssignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	String studentId;
	String name;
	
	Student(String name , String studentId){
		this.name= name ;
		this.studentId= studentId;
	}
	

}

class marks extends Student{
	int marks1;
	int marks2 ;
	int marks3;
	
	marks(String name , String studentId , int marks1 , int marks2 , int marks3){
		super(name, studentId);
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}
	
	
}

class Result extends marks{
	
	Result(String name, String studentId, int marks1, int marks2, int marks3) {
        super(name, studentId, marks1, marks2, marks3);
    }
	
	int total = this.marks1 + this.marks2 + this.marks3;
	
	int display() {
		return total;
	}
	
	double avgMarks() {
		return total/3;
	}
	
	void showDetail() {
		 System.out.println("Student ID: " + studentId);
		System.out.println(this.name + " : and total :  " + this.total );
		System.out.println("Average: " + avgMarks());
        System.out.println("Marks: " + marks1 + ", " + marks2 + ", " + marks3);
	}
	
	
}

public class Prb3 {
	public static void main(String args[] ) {
		
		List<Result> r = Arrays.asList(
				new Result("umair","kfsdlj",99 , 99 ,99 ),
				new Result("gojo","jafdksjlf",00 ,00,00));
		
		r.stream()
		.filter(e -> e.name.equals("umair"))
		.forEach(e -> System.out.println(e.name + " total: " + e.display()));
		
		
		List<Result> filtered = r.stream()
			    .filter(e -> e.name.equals("umair"))
			    .collect(Collectors.toList());
		
		System.out.println(filtered.size()); 
		
	}

}
