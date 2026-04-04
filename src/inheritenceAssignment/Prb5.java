package inheritenceAssignment;

class Order{
	
	private String customerName;
	private int customerNumber;
	private double orderQuality;
	private double unitCost;
	
	Order(String customerName , int customerNumber , double orderQuality , double unitCost){
		this.customerName = customerName;
		this.customerNumber = customerNumber;
		this.orderQuality  = orderQuality;
		this.unitCost = unitCost;
	}
	Order(double orderQuality , double unitCost){
		this.orderQuality  = orderQuality;
		this.unitCost = unitCost;
	}
	
	public String getName(String customerName) {
		return this.customerName;
	}
	
	public int getNumber(int customerNumber) {
		return customerNumber;
	}
	
	public double getQuality(double orderQuality) {
		return orderQuality;
	}
	
	public double getCost(double unitCost) {
		return unitCost;
	}
	
	double computePrice(double unitCost , double orderQuantity) {
		return orderQuantity * unitCost;
	}
	
}

class shippedOrder extends Order{
	private double shippingCharge;
	private static final double SHIPPING = 40.0;
	
	shippedOrder(double orderQuality , double unitCost , double shippingCharge){
		super(orderQuality,unitCost);
		this.shippingCharge = shippingCharge;
	}
	
	@Override
	
	public double computePrice(double unitCost , double orderQuantity ) {
		return (orderQuantity * unitCost) + SHIPPING;
	}
}


public class Prb5 {
	
	public static void main(String args[] ) {
		Order o1 = new Order("Umair ",123,2 ,100);
		Order o2 = new shippedOrder(21,100 , 70);
		
		System.out.println(o1.getName(null));
		System.out.println(o1.computePrice(12, 8));
		
	}
	
	
	

}
