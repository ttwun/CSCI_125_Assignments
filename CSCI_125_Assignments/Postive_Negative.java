import java.util.Scanner;
// Write a Java program that contains a method to get a number from the user and print whether it is positive or negative
public class Postive_Negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Even number or Odd number Test");
		pov_neg();
	}

	public static void pov_neg() { 
		// a method to test if a number is divisible by 2 
		System.out.println("Enter your number: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if (num%2 == 0) {
			System.out.println(num + " is an even number.");
		} else
			System.out.println(num + " is an odd number.");
	}
}
