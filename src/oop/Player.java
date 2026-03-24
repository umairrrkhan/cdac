package oop;

class Player2{
	String name ;
	int score ;
	
	Player2(){  //default hai ye 
		this.name = "anoymous";
		this.score = 0 ;
	}
	
	// this one is parametized one hai 
	Player2(String name , int score){
		this.name = name;
		this.score = score ;
	}
	
	void showStat() {
		System.out.println(name + ":" + score);
	}
	
	
}

public class Player {
	
	public static void main(String[] args) {
		Player2 p1 = new Player2();
		Player2 p2  = new Player2("umair", 23);
	p1.showStat();
	p2.showStat();

}}
