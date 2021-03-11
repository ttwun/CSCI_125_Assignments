// Then derive a class HazardPay from PayCalculator that overrides the computePay method. The new method should return the amount returned by the base class method multiplied by 1.5.
public class HazardPay extends PayCalculator {

	HazardPay(double d) {
		super(d);
		// TODO Auto-generated constructor stub
	}
	
	double computePay (double hour) {
		return (payRate*hour*1.5); 
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HazardPay n = new HazardPay(20.00);
		double d = n.computePay(7.5);
		System.out.println(d);
		
	}

}
