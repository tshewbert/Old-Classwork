import java.util.Scanner;

/**
	Tyler Shewbert
	CS 111A, Section 001
	Lab 4
	November 18th, 2013
*/

public class AreaRectangle
{
   public static void main(String[] args)
   {
      double length,    // The rectangle's length
             width,     // The rectangle's width
             area;      // The rectangle's area
   
      // Get the rectangle's length from the user.
      length = getLength();
   
      // Get the rectangle's width from the user.
      width = getWidth();

      // Get the rectangle's area.
      area = getArea(length, width);

      // Display the rectangle data.
      displayData(length, width, area);
   }
   
   // The getLength method prompts the user to input the length of the rectangle
   public static double getLength()
   {
	   Scanner keyboard = new Scanner(System.in);
	   double length;	//To hold length
	   
	   // Get the length from the user
	   System.out.print("Enter the rectangle's length: ");
	   length = keyboard.nextDouble();
	   
	   // Return the length
	   return length;
   }
   
   // The getWidth method gets the width of the rectangle
   public static double getWidth()
   {
	   Scanner keyboard = new Scanner(System.in);
	   double width;	// To hold width
	   
	   // Gets the width from the user
	   System.out.print("Enter the rectangle's width: ");
	   width = keyboard.nextDouble();
	   
	   // Returns width
	   return width;
   }
   
   // The getArea method multiplies length times width to get the area of the reactangle
   public static double getArea(double length, double width)
   {
	  double area;	// To hold area
	  area = length*width;	// To multiple length times width and store it in area
	  
	  // Returns area
	  return area;
   }
   
   // The displayData method displays the entered and calculated data
   public static void displayData(double length, double width, double area)
   {
	   System.out.println("");
	   System.out.println("Rectangle length: " + length);
	   System.out.println("Rectangle width: " + width);
	   System.out.println("Rectangle area : " + area);
   }
}
