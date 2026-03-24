package oop;

//Create a Movie class with title, rating. Use constructor 
//chaining — a 1-arg constructor (title only) should chain to a 2-arg constructor that sets default rating to 5.0.

class Movie{
	String title;
	double rating;
	
	Movie(String title , double rating){
		this.rating = rating;
		this.title = title ;
	}
	
	Movie(String title){
		this(title , 5.0);
	}
	

}

public class Mov {

	public static void main(String [] args) {
		
		Movie m1 = new Movie("umair");
		System.out.println(m1);
		
	}
	
}
