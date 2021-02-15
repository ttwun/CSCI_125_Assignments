import java.util.Scanner;
// Create a class that takes an integer and prints the integer + 1
public class Add_1_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
        System.out.println("Enter your number");
        int num = scanner.nextInt();
        int sum = ++num;
        System.out.println("Final sum is " + sum);
	}

}
