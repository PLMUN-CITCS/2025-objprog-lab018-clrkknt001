package OOB;
import java.util.Scanner;

public class EvenOddChecker {

	public static void main(String[] args) {
		int number = getIntegerInput();
		String result = checkEvenOrOdd(number);
		System.out.print(number + " is an " + result + " number");
		

	}
	
	static int getIntegerInput() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = s.nextInt();
		return number;
		
	}
	static String checkEvenOrOdd(int number) {
		if (number % 2 == 0) {
		return "Even";
		}
		else return "Odd";
		
	}

}
