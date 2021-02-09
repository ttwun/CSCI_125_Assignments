import java.util.Scanner;
public class Weekday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		weekday();
	}
	
	public static void weekday() {
		System.out.println("Please enter a number between 1 and 7");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt(); 
		switch (num) {
		case 1: System.out.println("Today is Sunday.");
		break;
		case 2: System.out.println("Today is Monday.");
		break;
		case 3: System.out.println("Today is Tuesday.");
		break;
		case 4: System.out.println("Today is Wednesday.");
		break;
		case 5: System.out.println("Today is Thursday.");
		break;
		case 6: System.out.println("Today is Friday.");
		break;
		case 7: System.out.println("Today is Saturday.");
		break;
		default: System.out.println("Please enter a number between 1 and 7!");
		}
	}

}
