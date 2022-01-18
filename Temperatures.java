/**
 @author:	 Zachary Springer
 @date:		 03/27/2019
 desc:		 This program can find the avg temp for any given day or hour. As well as convert temps 
 *           from f to c, or vice versa.
*/

public class Temperatures {
	/**
		Calculates the Average of a given array
	*/
	public static double average (double[] array) {
		double arraySum = 0;
		double avg = 0;
		for(int i = 0; i < array.length; i++){
			arraySum += array[i];
		}
		avg = arraySum / array.length;
		return avg;
	}
	
	/**
		Converts Celsius to Fahrenheit
	*/
	public static double c2f (double c) {
		double f = (c * 1.8 + 32);
		return f;
	}
	
	/**
		Converts Fahrenheit to Celsius
	*/
	public static double f2c (double f) {
		double c = ((f - 32) * 0.55555556);
		return c;
	}
	
	/**
		Calculates the Average of Temperature for a given hour, across every day in temps
	*/
	public static double averageHour (double[][] temps, int hour) {
		double arraySum = 0;
		double avg = 0;
		for (int i = 0; i < temps.length; i++){
			arraySum += temps[i][hour];
			}
		avg = arraySum / temps.length;
		return avg;
	}
	
	/**
		Calculates the Average of Temperature for a given day, across every hour in temps
	*/
	public static double averageDay (double[][] temps, int day) {
		double arraySum = 0;
		double avg = 0;
		for (int i = 0; i < temps[day].length; i++){
			arraySum += temps[day][i];
		}
		avg = arraySum / temps[day].length;
		return avg;
	}
	
	/**
		Returns the temperature for a given hour during a given day.
	*/
	public static double getTemperature (double[][] temps, int day, int hour) {
		double temp = temps[day][hour];
		return temp;
	}
	
	/**
		Traverses temps and converts every number into Celsius.
	*/
	public static void convertToCelsius(double[][] temps) {
		for (int day = 0; day < temps.length; day++){
			for (int hour = 0; hour < temps[day].length; hour++){
				temps[day][hour] = f2c(temps[day][hour]);
			}
		}
	}
	
	/**
		Traverses temps and converts every number into Fahrenheit.
	*/
	public static void convertToFahrenheit(double[][] temps) {
		for (int day = 0; day < temps.length; day++){
			for (int hour = 0; hour < temps[day].length; hour++){
				temps[day][hour] = c2f(temps[day][hour]);
			}
		}
	}
	
	public static void main (String[] args) {
		// [day][hour]
		double[][] temps = {
			{73.0, 73.9, 73.0, 73.9, 73.9, 73.9, 73.0, 71.1, 71.1, 71.1, 70.0, 70.0, 70.0, 70.0, 70.0, 71.1, 71.1, 71.6, 71.1, 71.1, 70.0, 71.1, 70.0, 71.1},
			{63.0, 63.0, 62.1, 62.1, 62.1, 62.1, 62.1, 62.1, 62.1, 62.1, 62.1, 62.1, 62.1, 62.1, 61.0, 62.6, 62.6, 62.1, 62.1, 62.1, 62.1, 62.1, 62.1, 62.1},
			{68.0, 68.0, 69.1, 69.1, 69.1, 73.9, 75.0, 75.9, 81.0, 81.0, 82.0, 84.0, 80.1, 78.1, 75.9, 77.0, 80.1, 81.0, 82.0, 81.0, 81.0, 79.0, 78.1, 78.1},
			{78.1, 78.1, 78.1, 77.0, 77.0, 77.0, 75.9, 75.0, 75.2, 75.9, 73.9, 73.9, 73.9, 73.0, 73.0, 73.0, 73.9, 73.9, 73.0, 73.4, 73.0, 73.0, 75.0, 75.0},
			{71.1, 71.1, 70.0, 70.0, 70.0, 70.0, 70.0, 70.0, 70.0, 70.0, 69.1, 69.1, 69.1, 69.1, 68.0, 66.9, 66.0, 66.0, 66.0, 66.0, 66.0, 66.0, 64.9, 64.9},
			{61.0, 61.0, 61.0, 61.0, 61.0, 61.0, 60.1, 60.1, 60.1, 60.1, 60.1, 60.1, 60.1, 60.1, 60.1, 60.1, 60.1, 60.1, 60.1, 61.0, 61.0, 61.0, 64.9, 64.9},
			{57.0, 55.0, 55.0, 55.0, 54.0, 54.0, 55.0, 54.0, 55.0, 55.9, 55.9, 55.0, 55.0, 57.0, 62.1, 66.9, 71.1, 73.0, 75.0, 77.0, 78.1, 78.1, 78.1, 75.9},
			{62.1, 61.0, 61.0, 60.1, 60.1, 59.0, 59.0, 61.0, 66.9, 72.0, 75.9, 78.1, 78.1, 78.1, 78.1, 78.1, 77.0, 75.0, 72.0, 71.1, 70.0, 68.0, 66.0, 64.0},
			{63.0, 62.1, 61.0, 61.0, 59.0, 60.1, 59.0, 60.1, 66.9, 73.9, 75.9, 78.1, 81.0, 79.0, 81.0, 79.0, 79.0, 75.9, 73.0, 72.0, 71.1, 71.1, 71.1, 70.0},
			{70.0, 69.1, 70.0, 69.1, 69.1, 69.1, 69.1, 69.1, 68.0, 68.0, 68.0, 70.0, 69.8, 70.0, 70.0, 70.0, 71.1, 70.0, 70.0, 71.1, 71.1, 71.1, 73.0, 73.0},
			{61.0, 61.0, 60.1, 59.0, 59.0, 59.0, 57.9, 59.0, 59.0, 60.1, 61.0, 61.0, 63.0, 66.9, 66.0, 71.1, 71.1, 73.9, 72.0, 75.9, 75.0, 75.9, 75.9, 75.0},
			{62.1, 62.1, 62.1, 61.0, 62.1, 61.0, 62.1, 62.1, 63.0, 62.1, 61.0, 61.0, 61.0, 61.0, 64.0, 64.9, 66.0, 66.0, 68.0, 70.0, 66.0, 64.0, 62.1, 62.1},
			{63.0, 63.0, 64.0, 64.0, 64.9, 63.0, 63.0, 64.0, 68.0, 72.0, 75.0, 77.0, 79.0, 79.0, 79.0, 79.0, 78.1, 75.9, 73.0, 72.0, 71.1, 71.1, 70.0, 69.1},
			{69.1, 68.0, 66.0, 66.0, 64.9, 64.0, 64.0, 63.0, 63.0, 64.0, 64.0, 64.0, 64.9, 68.0, 73.0, 75.0, 77.0, 79.0, 80.1, 80.1, 79.0, 77.0, 71.1, 64.0},
			{57.9, 57.9, 59.0, 59.0, 57.0, 55.9, 55.0, 55.0, 60.1, 64.9, 70.0, 73.0, 73.0, 73.9, 75.0, 73.9, 75.0, 72.0, 61.0, 57.0, 55.9, 54.0, 53.1, 53.1},
			{53.1, 53.1, 52.0, 52.0, 51.1, 51.1, 54.0, 55.0, 64.0, 69.1, 73.0, 77.0, 79.0, 81.0, 81.0, 81.0, 78.1, 75.0, 73.0, 72.0, 68.0, 66.9, 66.0, 66.0},
			{62.1, 61.0, 57.9, 57.0, 57.0, 55.0, 54.0, 54.0, 57.0, 63.0, 66.0, 66.9, 70.0, 72.0, 72.0, 72.0, 71.1, 68.0, 63.0, 57.9, 59.0, 55.0, 55.0, 53.1},
			{53.1, 51.1, 48.9, 48.0, 46.9, 45.0, 44.1, 45.0, 48.0, 51.1, 54.0, 55.0, 55.9, 57.9, 59.0, 60.1, 59.0, 57.0, 52.0, 46.9, 46.0, 43.0, 45.0, 42.1},
			{42.1, 39.9, 39.9, 39.9, 39.9, 39.0, 37.9, 39.9, 45.0, 50.0, 55.0, 57.0, 59.0, 60.1, 61.0, 61.0, 61.0, 57.9, 52.0, 48.0, 46.9, 45.0, 45.0, 45.0},
			{45.0, 43.0, 43.0, 43.0, 42.1, 42.1, 42.1, 43.0, 52.0, 57.0, 61.0, 64.0, 68.0, 70.0, 71.1, 70.0, 69.1, 66.9, 62.1, 57.0, 54.0, 54.0, 53.1, 52.0},
			{51.1, 50.0, 50.0, 51.1, 51.1, 51.1, 50.0, 52.0, 57.9, 64.0, 70.0, 73.0, 75.0, 75.0, 75.9, 75.0, 73.0, 70.0, 66.9, 63.0, 62.1, 60.1, 60.8, 61.0},
			{55.9, 57.0, 57.0, 57.0, 57.0, 57.0, 55.9, 55.0, 55.0, 55.0, 55.0, 55.0, 55.0, 54.0, 54.0, 54.0, 54.0, 54.0, 54.0, 54.0, 54.0, 54.0, 53.1, 53.1},
			{57.0, 55.9, 55.0, 54.0, 54.0, 53.1, 53.1, 54.0, 54.0, 53.1, 54.0, 54.0, 54.0, 54.0, 54.0, 54.0, 54.0, 53.1, 53.1, 53.1, 62.1, 68.0, 73.0, 77.0},
			{63.0, 59.0, 57.9, 57.9, 55.9, 55.9, 55.0, 55.9, 60.1, 63.0, 66.0, 69.1, 72.0, 72.0, 73.9, 73.0, 70.0, 68.0, 64.0, 61.0, 59.0, 61.0, 57.9, 57.9},
			{55.9, 55.9, 55.0, 55.0, 54.0, 55.0, 55.0, 55.0, 55.0, 55.0, 55.0, 55.9, 57.0, 57.0, 57.9, 61.0, 64.0, 68.0, 73.0, 75.9, 78.1, 78.1, 77.0, 78.1},
			{64.9, 66.0, 64.9, 64.0, 64.0, 63.0, 61.0, 61.0, 61.0, 61.0, 63.0, 66.9, 64.0, 66.0, 64.0, 64.0, 64.0, 62.1, 61.0, 60.1, 59.0, 57.9, 57.9, 57.9},
			{57.9, 57.9, 57.9, 57.9, 57.9, 57.9, 57.0, 57.9, 59.0, 60.1, 59.0, 60.1, 60.1, 61.0, 63.0, 64.9, 66.0, 66.0, 66.0, 66.0, 66.9, 66.9, 66.0, 66.0},
			{70.0, 70.0, 71.1, 71.1, 71.1, 71.1, 70.0, 70.0, 69.1, 71.1, 71.1, 73.0, 73.9, 75.9, 77.0, 73.9, 73.0, 72.0, 72.0, 72.0, 72.0, 72.0, 72.0, 72.0},
			{72.0, 71.1, 71.1, 71.1, 70.0, 68.0, 68.0, 68.0, 66.2, 66.9, 66.0, 66.0, 69.1, 70.0, 70.0, 73.0, 73.9, 75.9, 77.0, 79.0, 78.1, 75.0, 72.0, 69.1},
			{66.9, 66.0, 66.0, 66.0, 66.0, 64.9, 64.0, 63.0, 64.0, 66.0, 69.1, 71.1, 73.0, 73.0, 73.0, 73.9, 73.0, 70.0, 61.0, 59.0, 57.0, 55.9, 54.0, 53.1},
			{51.1, 51.1, 51.1, 51.1, 51.1, 52.0, 51.1, 51.1, 54.0, 60.1, 64.0, 66.0, 68.0, 69.1, 68.0, 68.0, 66.9, 64.9, 63.0, 60.1, 59.0, 60.1, 57.9, 57.0}
		};
		
		// Blocks of code to test implementations
		double[] testValues = {3, 4, 5};
		System.out.println("Average: " + average(testValues)); // Should be 4.0
		System.out.println("C 2 F: " + c2f(20)); // Should be 68
		System.out.println("F 2 C: " + f2c(100)); // Should be 37.7 (repeating)
		System.out.println("Average Hour: " + averageHour(temps, 0)); // Should be ~61.3 (repeating)
		System.out.println("Average Day: " + averageDay(temps, 0)); // Should be ~71.5
		System.out.println("Day 7 - Hour 5: " + getTemperature(temps, 7, 5)); // Should be 59.0 (starting at 0)
		convertToCelsius(temps);
		System.out.println("Day 7 - Hour 5: " + getTemperature(temps, 7, 5)); // Should be 15.0 (starting at 0)
		convertToFahrenheit(temps);
		System.out.println("Day 7 - Hour 5: " + getTemperature(temps, 7, 5)); // Should be 59.0 (starting at 0)
	}
}