import java.util.Scanner;
// Write a Java program that contains a method to Take three numbers from the user and print the greatest number
public class Three_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Find the greatest of three numbers");
		Three_Num();
	}
	
	public static void Three_Num() {
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter first number:");
		int num1 = scan.nextInt();
		System.out.println("Please enter second number:");
		int num2 = scan.nextInt();
		System.out.println("Please enter third number:");
		int num3 = scan.nextInt();
		if (num1== num2 || num1== num3 || num2== num3) {
			System.out.println("Please enter three different numbers");
		} else if (num1>num2 && num1>num3) { 
			System.out.println(num1 + " is the greatest number.");	
		} else if (num2>num1 && num2>num3) {
			System.out.println(num2 + " is the greatest number.");
		} else 
			System.out.println(num3 + " is the greatest number.");
	}
}
