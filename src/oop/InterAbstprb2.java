package oop;


interface Dicountable{
	double calculateDiscount();
}

abstract class Product{
	String name ;
	double price;
	
	
	Product(String name , double price){
		this.name = name ;
		this.price = price;
		
	}
	
	abstract String getCategory() ;
	
	public void display() {
		System.out.println(this.name + " this is the product " + this.price + "this is the price");
	}
}


class Electronics extends Product implements Dicountable{
	String brand;
	
	
	Electronics(String name , double price ,String brand ){
		super(name , price);
		this.brand = brand;
	}
	
	public String getCategory() {
		return "Electronics";
	}
	
	
	public double calculateDiscount() {
		double finalresult= price*0.10;
		return price - finalresult; //after discount
	}
	
	
}


class Clothing extends Product implements Dicountable{
	String size;
	
	Clothing(double amount , String name , String size ){
		super(name , amount);
		
		this.size = size;
	}
	
	public String getCategory() {
		return "Clothing";
	}
	
	public double calculateDiscount() {
		double finalresult= price*0.20;
		return price - finalresult; //after discount
	}
	
	
	
	
}
public class InterAbstprb2 {
	
	public static void main(String args[] ) {
		
		Clothing c = new Clothing(1000 , "bata" ,"m");
		
		Electronics e = new Electronics("japan " ,1000 , "hips");
		
		System.out.println(c.getCategory());
        System.out.println(c.calculateDiscount());
        
        
        System.out.println(e.getCategory());
        System.out.println(e.calculateDiscount());
		
		
		
	}

}
