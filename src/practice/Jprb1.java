package practice;

class Student{
	private String name;
	private int rollno;
	private double marks;
	
	
	Student(String name , int rollno , double marks){
		this.name = name ;
		this.rollno= rollno;
		setMarks(marks);
	}
	
	public String getName() {
		return this.name ;
	}
	
	public int getRollno() {
		return this.rollno;
	}
	
	public double getMarks() {
		return this.marks;
	}
	
	public void setMarks(double marks) {
		if (marks <=100  ) {
			this.marks = marks;}
	}
	
	public void display() {
		System.out.println(this.name + " : " + this.rollno + "  : " + this.marks );
	}
}

public class Jprb1 {
	
	public static void main(String [] args) {
		
		Student s1 = new Student("Umair",23 , 100);
		Student s2 = new Student("haifa ", 19 , 101);
		
		s1.display();
		s2.display();
		System.out.println(s1.getMarks());
		
	}

}
