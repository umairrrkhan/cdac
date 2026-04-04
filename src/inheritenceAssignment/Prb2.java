package inheritenceAssignment;

import java.util.Arrays;
import java.util.List;

abstract class Payment{

	abstract double makePayment(double amount) ;
}

class creditCardpayment extends Payment {
	double amount;
	
	creditCardpayment(double amount){
		this.amount= amount;
	}
	
	@Override
	double makePayment(double amount) {
		System.out.println(this.amount + " the amount got paid ");
		return amount;
	}
	
}

class upiPayment extends creditCardpayment {
	upiPayment(double amount) {
        super(amount);
    }
    
    @Override
    double makePayment(double amount) {
        System.out.println(this.amount + " the amount got paid via UPI");
        return this.amount;
    }
}

public class Prb2 {
	
	public static void main(String [] args) {
		List<Payment> ui = Arrays.asList(
				new creditCardpayment(4000),
				new upiPayment(6000),
				new creditCardpayment(899),
				new upiPayment(123),
				new upiPayment(23),
				new creditCardpayment(345));
		
		 double total = ui.stream()
		            .filter(e -> e instanceof upiPayment)
		            .map(e -> ((upiPayment) e).amount)
		            .mapToDouble(Double::doubleValue)
		            .sum();

		        System.out.println("Total UPI payments: " + total);
		    }
	}


