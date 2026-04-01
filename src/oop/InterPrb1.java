package oop;

abstract class Payment{
	protected double amount;
	
	
	Payment(double amount){
		this.amount = amount;
		System.out.println("abstract class const call");
	}
	
	abstract void process();
	
	public void display() {
		System.out.println(this.amount + "   this is the amount bro ");
	}
}

class creditCard extends Payment{
	String cardNumber;
	
	
	creditCard(String cardNumber , double amount){
		super(amount);
		this.cardNumber = cardNumber;
		
		System.out.println("here creditcard const called");
	}
	@Override
	public void process() {
		System.out.println("this is the amount "+ this.amount +"  paid here ");
	}
}

class upiPayment extends Payment{
	String upiId;
	
	upiPayment(String upiId , double amount){
		super(amount);
		this.upiId = upiId;
		System.out.println("this is upiId constructor");
	}
	
	public void process() {
		System.out.println("thjis is the amount "+ this.amount + "paid to the upiId");
	}
	
	
}

public class InterPrb1 {

	public static void main(String[] args) {
		
		upiPayment [] u = new upiPayment[1];
		u[0] = new upiPayment("jslkdjf", 1000);
		
		creditCard [] i = new creditCard[1];
		i[0] = new creditCard("jalfdjlsk",1000);
		
		
		for (upiPayment o : u) {
			o.process();
			o.display();
		}
		
		System.out.println(" ");
		
		
		for(creditCard p : i) {
			p.process();
			p.display();
		}
		
	}
	
}
