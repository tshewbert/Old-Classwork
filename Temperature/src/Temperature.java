//Name: Tyler Shewbert
//Date: 3/12/14
//Email: tshewbert@smiocs.com
//Assignment Number: this is Lesson 6 Programming Assignment
//Work Load: five hours
//Thoughts: I had difficulty trying to change equals(). I read a lot of different ways
//for dealing with that issue and I finally found one that seemed the simplest logically.
//This led to a problem with the last test in which I had to re-convert the temperature
//manually again for the last test.
//High Level Algorithm
//1. Create a Temperature Class containing a degrees and type value
//2. Allow a user or test program to enter values
//3. Create methods for changing and displaying these values amongst each other
//4. Compare the values

import java.util.Scanner;

public class Temperature
{
	private double degrees;
	private char type;
	
	//Constructors
	public Temperature ()
	{
		degrees = 0.0;
		System.out.print(" ");
		type = 'c';
	}
	
	//For double only
	public Temperature (double newTemp)
	{
		degrees = newTemp;
	}
	
	//For char only
	public Temperature (char newType)
	{
		type = newType;
	}
	
	//for both
	public Temperature (double celcius, char c)
	{
		degrees = celcius;
		type = c;
	}
	
	//method for reading user typed input
	public void readInput()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a temperature in degress (for example 29.6): ");
		degrees = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter 'F' (or 'f') for Fahrenheit or 'C' (or 'c') for Celsius:");
		type = scanner.next().charAt(0);
		System.out.println(degrees + " " + type);
		
	}
	
	//For writing the output of both
	public void writeOutput()
	{
		System.out.print(degrees);
		System.out.print(type);
	}
	
	//For writing the value of degrees in C
	public void writeC()
	{
		switch (type)
		{
		case 'C':
			System.out.print(Math.round(degrees*10)/10.0 + " Celsius ");
			break;
		case 'c':
			System.out.print(Math.round(degrees*10)/10.0 + " Celsius ");
			break;
		case 'F':
			double cConvert = (degrees - 32)*(5.0/9.0);
			System.out.print(Math.round(cConvert*10)/10.0 + " Celsius ");
			break;
		case 'f':
			cConvert = (degrees - 32)*(5.0/9.0);
			System.out.print(Math.round(cConvert*10)/10.0 + " Celsius ");
			break;
		default:
			getC();
		}
		
	}
	
	//For writing the value of degrees in F
	public void writeF()
	{
		switch (type)
		{
		case 'F':
			System.out.print(Math.round(degrees*10)/10.0 + " Farenheit ");
			break;
		case 'f':
			System.out.print(Math.round(degrees*10)/10.0 + " Farenheit ");
			break;
		case 'C':
			double fConvert = degrees*9.0/5.0+32;
			System.out.print(Math.round(fConvert*10)/10.0 + " Farenheit ");
			break;
		case 'c':
			fConvert = degrees*9.0/5.0+32;
			System.out.print(Math.round(fConvert*10)/10.0 + " Farenheit ");
			break;
		default:
			getF();
		}
	}
	
	//For converting a non-C to C
	public double getC()
	{
		if (type != 'C' || type != 'c')
		{
			double cConvert = (degrees - 32)*(5.0/9.0);
			degrees = Math.round(cConvert*10)/10.0;
		}
			
		return degrees;
	}
	
	//For converting a non-F to F
	public double getF()
	{
		if (type != 'F' || type != 'F')
		{
			double fConvert = degrees*9.0/5.0+32;
			degrees = Math.round(fConvert*10)/10.0;
		}
			
		return degrees;
	}
	
	//degrees mutator
	public void set(double newTemp)
	{
		degrees = newTemp;
		
	}
	
	//Type mutator
	public void set(char newType)
	{
		type = newType;
	}
	
	//For both
	public void set(double newTemp, char newType)
	{
		degrees = newTemp;
		type = newType;
	}
	
	//To change equals to compare to temperature values
	public boolean equals(Object oth) {
	    if (oth == this) return true;
	    if (oth == null) return false;
	    if (getClass() != oth.getClass()) return false;
	    Temperature t = (Temperature)oth;
	    return (degrees == t.getC());
	}
	
	//to convert the values of degrees and temp to strings values for display
	public String toString()
	{
		double fConvert = degrees*9.0/5.0 + 32 -.1;
		degrees = Math.round(fConvert*10)/10.0;
		String s1 = "" + degrees;
		String s2 = "" + type;
		return s1 + " " + s2;
		
		
	}
	
	
	

}