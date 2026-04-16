package hashMap;

import java.util.*;

import java.util.Objects;

public final class Student{  // this should match the filename
	private final int id;
	private final String name;
	
	Student(int id , String name ){
		this.id = id;
		this.name = name;
	}
	public int getId() { return id ;}
	public String getName () { return name ;}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true; // here im checking the same memrory is in that object
		if(o == null || getClass() != o.getClass()) return false ;
		
		Student student = (Student) o;
		
		return id == student.id;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}

public class Xp2 {

	public static void main(String args[] ) {
		Map<Student , String > grades = new HashMap<>();
		
		Student s1 = new Student(101, "umair");
	    grades.put(s1, "A+");
	    
	    Student s2 = new Student(101, "umair");
	    System.out.println(grades.get(s2));
	    
	    Student s3 = new Student(102, "umair");
	    System.out.println(grades.get(s2));
	}
}
