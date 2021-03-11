// Create an abstract class PayCalculator that has an attribute payRate given in dollars per hour. The class should also have a method computePay(hours) that returns the pay for a given amount of time.
abstract class PayCalculator {

	double payRate; 
	
	PayCalculator(double d){
		payRate = d; 
	}

	double computePay (double hour) {
		return (payRate*hour); 
	}

}
