//Suppose that we are selling boxes of candy for a fund-raiser. We have five kinds of candy to sell: Mints, Chocolates
//with Nuts, Chewy Chocolates, Dark Chocolate Creams, and Sugar-Free Suckers. We will record a customer’s order as
//an array of five integers, representing the number of boxes of each kind of candy. Write a static method
//combineOrder that takes two orders as its arguments and returns an array that represents the combined orders. For
//example, if order1 contains 0, 0, 3, 4, and 7, and order2 contains 0, 4, 0, 1, and 2, the method should return an array
//containing 0, 4, 3, 5, and 9.

public class CandyOrder {
	static int[] combineOrder(int[] order1, int[] order2) {
		int [] totalOrder = new int [5];
		for (int i=0; i< totalOrder.length; i++) {
			totalOrder[i] = order1[i] + order2[i];
		}
		return totalOrder;
	}
	
}
