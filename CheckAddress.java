/**
	Author:		Zachary Springer
	Date:		4/24/19	
	Desc:		This program, using regex, checks to see if a user input is a valid address
*/
import java.util.Scanner;
public class CheckAddress {
	public static void main(String[] args) {
		// Create the 'stream' to receive user inputs
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.print("Enter an address (or end to stop): ");
			String userInput = input.nextLine();
			if (validAddress(userInput)) {
				System.out.println("Based on my results, this is a valid address.");
			} else if (userInput.equals("end")) {
				break;
			} else {
				System.out.println("Based on my results, this is an invalid address.");
			}
		}
		
	}
	
	/*
		Determines whether a String is a valid address.
	*/
	public static boolean validAddress(String address) {
		// \\d+ means any number of numbers
		// [a-zA-Z0-9]\\. \\ ]+ means at least 1 letter/number/space/period
		// (Rd|St|Dr|Ave|Blvd|Ctr) means ends with one of the suffixes
		String regularExpression = "\\d+ [a-zA-Z0-9]\\. \\ ]+ (Rd|St|Dr|Ave|Blvd|Ctr)";
		return address.matches(regularExpression);
	}
}