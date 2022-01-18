/**
	@author:	 	Zachary Springer
	@date:		 	04/29/2019
	desc:		 	Using Regex, this program checks to see if a phone number, SSN, and password are valid. 
*/
import java.util.Scanner;

public class RegularExpressions {
	public static void main(String[] args){
		
		System.out.println("'(910) 867-5309' is a valid phone number: " + validPhoneNumber("(910) 867-5309"));
		System.out.println("'910 867 5309' is a valid phone number: " + validPhoneNumber("910 867 5309"));
		System.out.println("'(910) 867-5309' is a valid phone number: " + validPhoneNumber("(910) 867-5309"));
		System.out.println("'867 5309' is a valid phone number: " + validPhoneNumber("867 5309"));
		
		System.out.println("");
		
		System.out.println("'123-45-6789' is a valid SSN: " + validSSN("123-45-6789"));
		System.out.println("'123456789' is a valid SSN: " + validSSN("123456789"));
		System.out.println("'123 45 6789' is a valid SSN: " + validSSN("123 45 6789"));
		System.out.println("'123_45_6789' is a valid SSN: " + validSSN("123_45_6789"));
		
		System.out.println("");
		
		System.out.println("'Password' is a valid password: " + validPassword("Password"));
		System.out.println("'1password' is a valid password: " + validPassword("1password"));
		System.out.println("'Tr0ub4dor&3' is a valid password: " + validPassword("Tr0ub4dor&3"));
		System.out.println("'Correct Horse Battery Staple' is a valid password: " + validPassword("Correct Horse Battery Staple"));
		System.out.println("'thisisaverylongpassword' is a valid password: " + validPassword("thisisaverylongpassword"));
		System.out.println("'Java' is a valid password: " + validPassword("Java"));
		
	}
	
	//Checks to see if phone number is valid
	//Returns Boolean
	public static boolean validPhoneNumber(String number) {
		// ^\\(? 					~may start with (
		// (\\d{3})					~3 digits
		// \\)?						~checks for closing )
		// [- ]?					~checks for - and space
		// (\\d{3})					~next 3 characters
		// [- ]?					~checks for last - and space
		// (\\d{4})$				~last 4 characters
		
		String regularExpression = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$";
		
		return number.matches(regularExpression);
	}
	
	//Checks to see if SSN is valid
	//Returns Boolean
	public static boolean validSSN(String number){
		// ^(\\d{3})			~Checks first 3 digits
		// [- ]?				~checks for - and space
		// (\\d{2})				~next 2 characters
		// [- ]?				~checks for - and space
		// (\\d{4})$			~last 4 characters
		
		String regularExpression = "^(\\d{3})[- ]?(\\d{2})[- ]?(\\d{4})$";
		
		return number.matches(regularExpression);
	}
	
	//Checks to see if password is valid
	//Returns Boolean
	public static boolean validPassword(String password){
		// ^(?=.*[A-Z])						~Start w/ uppercase letter
		// ([a-z0-9\\ ]*)					~At least one lowercase letter / numbers / spaces
		// (.{8,}) 							~At least 8 chars long
		// ([$&+,:;=?@#|'<>.^*()%!-]?)$		~allows special characters
		
		String regularExpression = "^(?=.*[A-Z])([a-zA-Z0-9\\ ]*)(.{8,})([$&+,:;=?@#|'<>.^*()%!-]?)$";
		
		return password.matches(regularExpression);
	}
	
	
	
	
	
	
	
}