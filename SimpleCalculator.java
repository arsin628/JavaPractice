import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class SimpleCalculator {

	
	@SuppressWarnings({ "resource", "null" })
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		BufferedReader bRString = null;

		System.out.println("Enter your first  number !");

		while (!scanner.hasNextInt()) {

			System.out.println("That's not a  number ....");
			scanner.next();
		}

		int firstNum = scanner.nextInt();

		System.out.println("Enter your second  number !");

		while (!scanner.hasNextInt()) {

			System.out.println("Thats not a  number.....");
			scanner.next();

		}
		int secondNum = scanner.nextInt();

		System.out.println("Now if you wanna add them please type 'sum' ");

		String sumKey;
		try {
			sumKey = bRString.readLine();
	
			if (sumKey.equals("sum")) {

				int sum = firstNum + secondNum;
				System.out.println("and the sum value of the two number you want to know is " + sum);

			}
		
		} catch (IOException e) {

			System.err.println("Thats not 'sum' please re- enter " + e);
		}

			
		

		System.exit(0);
	}

}
