// Derive a class BulkDiscount from DiscountPolicy, as described in the previous exercise. It should have a constructor that has two parameters, minimum and percent. It should define the method computeDiscount so that if the quantity purchased of an item is more than minimum, the discount is percent percent.
public class BulkDiscount extends DiscountPolicy {

	double minimum; 
	double percent; 
	
	BulkDiscount (double m, double p){
		minimum = m;
		percent = p; 
	}
	
	double computeDiscount(int count, double itemCost) {
		if (count > minimum) {
			return percent * count * itemCost; 
		} 
		return 0;
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
