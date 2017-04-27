
import java.util.Scanner;

public class KK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner object to take input from the users

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the date in the format dd/mm/yyyy ");
		String input_date = scanner.nextLine();

		// Splitting the date into a string array

		String[] date_parts = input_date.split("/");

		// Printing the result according to the expected output

		System.out.print("Reverse order of the date which you entered is " + date_parts[2] + " " + date_parts[1] + " "
				+ date_parts[0]);
	}

}
