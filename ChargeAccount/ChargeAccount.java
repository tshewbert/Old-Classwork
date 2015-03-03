import java.util.scanner
/**
	Tyler Shewbert
	CS 111A, Section 001
	Lab 5
	December 5th, 2013
*/

public class ChargeAccount
{
   public static void (String[] args)
   {
	   Scanner keyboard = new Scanner(System.in);
	   
	   int input;
	   
	   System.out.println("Enter a charge account number:  ");
	   isValid(input) = keyboard.nextInt();
	   
	   public static int isValid(input)
	   {
		   int[] accountNumbers = {
				   5658845, 4520125, 7895122, 8777541, 8451277, 1302850,
				   8080152, 4562555, 5552012, 5050552, 7825877, 1250255, 
				   1005231, 6545231, 3852085, 7576651, 7881200, 4581002
				   };
		   
		   input = sequentialSearch(accountNumbers)
		      // Determine whether 100 was found and
		      // display an appropriate message.
		      if (results == -1)
		      {
		         System.out.println(input + " is not a valid charge account number");
		      }
		      else
		      {
		         System.out.println(input + " is a valid charge account number");
		      }
		   }
		   
		   /**
		      The sequentialSearch method searches an array for
		      a value.
		      @param array The array to search.
		      @param value The value to search for.
		      @return The subscript of the value if found in the
		              array, otherwise -1.
		   */

		   public static int sequentialSearch(int[] accountNumbers, int input)
		   {
		      int index;        // Loop control variable
		      int element;      // Element the value is found at
		      boolean found;    // Flag indicating search results

		      // Element 0 is the starting point of the search.
		      index = 0;

		      // Store the default values element and found.
		      element = -1;
		      found = false;

		      // Search the array.
		      while (!found && index < array.length)
		      {
		         if (array[index] == value)
		         {
		            found = true;
		            element = index;
		         }
		         index++;
		      }

		      return element;
		   }
	   }
		   
	}
}