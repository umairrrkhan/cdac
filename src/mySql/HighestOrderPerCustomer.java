package mySql;

public class HighestOrderPerCustomer {
	
	/*
	 * select order_id , customer_id , max(amount)
	 * from orders
	 * group by customer_id
	 * 
	 *  Map<Integer , Order > result = orders.stream()
	 *  .collect(Collectors.groupingBy(
	 *  Order:: getCustomerId, Collecgtors.collectingAndThen(
	 *  Collectors.maxBy(Comparator.comparingInt(Order::getAmount)),
	 *  Optional::get)));
	 *  
	 *  
	 *  result.forEach((k, v) -> sysout(k , v);
	 * 
	 */

}
