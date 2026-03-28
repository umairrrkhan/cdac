package oop;


class Bank{
	private String holderName;
	private double balance;
	
	Bank(String holderName , double balance){
		this.holderName = holderName;
		this.balance = balance;
		
	}
	
	public String getHolderName() {
		return this.holderName;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void deposit(double amount) {
		if (amount > 0) {
			this.balance += amount;
			System.out.println("deposited  "+ amount);
		}
		else {
			System.out.println("invalid ");
		}
	}
	
	public void withdraw(double amount) {
		if(amount > 0 && amount <= this.balance) {
			this.balance-= amount;
			System.out.println("witdraw amount "+ amount);
		}
		else {
			System.out.println("invalid amount ");
		}
	}
}

public class EncapsulationPart1 {
	
	public static void main(String[] args) {
		Bank b1 = new Bank("umair ", 12000);
		System.out.println(b1.getHolderName());
		b1.withdraw(12);
		b1.deposit(10);
		System.out.println(b1.getBalance());  
	}
	

}
