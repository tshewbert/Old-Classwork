import java.util.Scanner;

/**
	This program allows the user to enter the sales of five different stores and creates bar 
	charts for each stores sales.

	Tyler Shewbert
	CS 111A, Section 001
	Lab 3
	November 9th, 2013
*/

public class Sales
{
	public static void main(String[] args)
	{
		//Variables to store user inputed data
		int storeOne;
		int storeTwo;
		int storeThree;
		int storeFour;
		int storeFive;
		
		// Variables for the asterisk charts
		int starsOne;
		int starsTwo;
		int starsThree;
		int starsFour;
		int starsFive;
		
		// Variables to set range
		final int MAX_VALUE = 4000;
		final int MIN_VALUE = 0;
		final int FACTOR = 100;
		
		Scanner keyboard = new Scanner(System.in);
		
		
		// Get the values of sales for each store and check whether or not the user inputed value is a multiple of 100 between 0
		// and 4000 inclusive.
		
		System.out.print("Enter today's sales for store 1: ");
		storeOne = keyboard.nextInt();

		// Store One
		while ((storeOne < MIN_VALUE || storeOne > MAX_VALUE) || (0 != storeOne % 100))
			{
				System.out.println("Invalid sales amount: " +storeOne);
				System.out.println("Sales must be multiple of 100 in range 0-4000, inclusive.");
				System.out.print("Enter today's sales for store 1: ");
				storeOne = keyboard.nextInt();
			}
		
		// Store Two
		System.out.print("Enter today's sales for store 2: ");
		storeTwo = keyboard.nextInt();
		
		while ((storeTwo < MIN_VALUE || storeTwo > MAX_VALUE) || (0 != storeTwo % 100))
			{
				System.out.println("Invalid sales amount: " +storeTwo);
				System.out.println("Sales must be multiple of 100 in range 0-4000, inclusive.");
				System.out.print("Enter today's sales for store 2: ");
				storeTwo = keyboard.nextInt();
			}
		
		// Store Three
		System.out.print("Enter today's sales for store 3: ");
		storeThree = keyboard.nextInt();
			
		while ((storeThree < MIN_VALUE || storeThree > MAX_VALUE) || (0 != storeThree % 100))
			{
				System.out.println("Invalid sales amount: " +storeThree);
				System.out.println("Sales must be multiple of 100 in range 0-4000, inclusive.");
				System.out.print("Enter today's sales for store 3: ");
				storeThree = keyboard.nextInt();
			}
			
		// Store Four
		System.out.print("Enter today's sales for store 4: ");
		storeFour = keyboard.nextInt();
				
		while ((storeFour < MIN_VALUE || storeFour > MAX_VALUE) || (0 != storeFour % 100))
			{						
				System.out.println("Invalid sales amount: " +storeFour);
				System.out.println("Sales must be multiple of 100 in range 0-4000, inclusive.");
				System.out.print("Enter today's sales for store 4: ");
				storeFour = keyboard.nextInt();	
			}
				
		// Store 5
		System.out.print("Enter today's sales for store 5: ");
		storeFive = keyboard.nextInt();
					
		while ((storeFive < MIN_VALUE || storeFive > MAX_VALUE) || (0 != storeFive % 100))
			{
				System.out.println("Invalid sales amount: " +storeFive);
				System.out.println("Sales must be multiple of 100 in range 0-4000, inclusive.");
				System.out.print("Enter today's sales for store 1: ");
				storeFive = keyboard.nextInt();
			}
		
		System.out.println("");
		// Create a bar chart using asterisks that shows each asterisk as a 100 dollars for each store	
		System.out.println("SALES BAR CHART");
		System.out.println("(each * = 100)");
		
		// Store 1
		System.out.print("Store 1: ");
		for (starsOne = 0; starsOne < storeOne/FACTOR; starsOne++)
			System.out.print("*");
		System.out.println();
		
		// Store 2
		System.out.print("Store 2: ");
		for (starsTwo = 0; starsTwo < storeTwo/FACTOR; starsTwo++)
			System.out.print("*");
		System.out.println();
		
		// Store 3
		System.out.print("Store 3: ");
		for (starsThree = 0; starsThree < storeThree/FACTOR; starsThree++)
			System.out.print("*");
		System.out.println();
		
		// Store 4
		System.out.print("Store 4: ");
		for (starsFour = 0; starsFour < storeFour/FACTOR; starsFour++)
			System.out.print("*");
		System.out.println();
		
		// Store 5
		System.out.print("Store 5: ");
		for (starsFive = 0; starsFive < storeFive/FACTOR; starsFive++)
			System.out.print("*");
		System.out.println();
	}
}