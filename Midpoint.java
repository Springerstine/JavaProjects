/**
 @author:	 Zachary Springer
 @date:		 05/22/2019
 desc:		 This program finds the midpoint of two user defined points
*/

import java.util.Scanner;

public class Midpoint {
	public static void main(String[] args){
		// Creates Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Prompts user for X1
		System.out.println("[+] Please enter X1: ");
		int x1 = input.nextInt();
		
		// Prompts user for Y1
		System.out.println("[+] Please enter Y1: ");
		int y1 = input.nextInt();
		
		// Prompts user for X2
		System.out.println("[+] Please enter X2: ");
		int x2 = input.nextInt();
		
		// Prompts user for Y2
		System.out.println("[+] Please enter Y2: ");
		int y2 = input.nextInt();
		
		// Displays midpoint
		System.out.println("[+] The midpoint of (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is (" + findXMidpoint(x1, x2) + ", " + findYMidpoint(y1, y2) + ")");
	}
	
	// Calculates the X midpoint
	public static double findXMidpoint(int x1, int x2){
		double xM = ((x1 + x2) / 2);
		
		return xM;
	}
	
	// Calculates the Y midpoint
	public static double findYMidpoint(int y1, int y2){
		double yM = ((y1 + y2) / 2);
		
		return yM;
	}
}