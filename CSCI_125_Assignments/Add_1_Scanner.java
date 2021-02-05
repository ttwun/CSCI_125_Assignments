import java.util.Scanner;
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
