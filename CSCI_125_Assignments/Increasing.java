//Write a static method isStrictlyIncreasing(double[] in) that returns true if each value in the given array is greater than
//the value before it, or false otherwise.

public class Increasing {
	static Boolean StrictlyIncreasing(double[] in) { 
		Boolean c = true;
		for (int i = 0; i < in.length; i++) {
			if (in[i+1] <= in[i]) {
				return !c;
			}
			else 
				return c; 
		}
		return c; 
	}
}
