package oop;

class Ui{
	String ui ;
	int legs;
	int heart;
	int finger;
	
	Ui(String ui , int legs, int heart, int finger){
		this.ui = ui;
		this.legs = legs;
		this.heart = heart;
		this.finger = finger;
		
	}
	void display() {
		System.out.println("pls be ready bro");
	}
	
	class Octoput extends Ui{
		String type ; 
		
		Octoput(String type , int heart ){
			super("Octo-Ui", 8, heart, 10);
			this.type = type;
			
		}
		
		void show() {
			super.display();
			System.out.println(heart + " "+ type);
		}
		
		public String toString() {
			return heart + " " +heart;
		}
		
	}
}

public class CONST {
	
	public static void main(String [] args) {
		Ui a = new Ui("haifa", 9, 100, 79);
        a.display(); 
	}

}
