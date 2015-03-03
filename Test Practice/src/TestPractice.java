import java.util.Scanner;

public class TestPractice 
{
		public static void main(String[] args)
		{
		String name;
		String occupation;
		int age;
		double income;
		int monthsWorked;
		int daysWorked;
		double incomeDay;
		double incomeMonth;
		double circumference;
		double radius;
		


		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("What is your name ");
		name = keyboard.nextLine();
		
		
		System.out.print("What is your occupation? ");
		occupation = keyboard.nextLine();
		
		System.out.print("What is your age? ");
		age = keyboard.nextInt();
		
		System.out.print("What is your income? ");
		income = keyboard.nextDouble();
		
		System.out.print("How many months did you work? ");
		monthsWorked = keyboard.nextInt();
		
		System.out.print("How many days did you work? ");
		daysWorked = keyboard.nextInt();
		
		//Calculated how much they made per day and per month
		incomeDay = income / daysWorked;
		incomeMonth = income / monthsWorked;
		
		
		System.out.println("Your name is " + name);
		System.out.println("Your occupation is" + occupation);
		System.out.println("You made " + incomeMonth + " a month." );
		System.out.println("You made " + incomeDay + " a day");
		
		//This formula calculates the circumference of a circle
		
		
		System.out.println("Enter radius: ");
		radius = keyboard.nextDouble();
		
		circumference = 2 * radius * Math.PI;

	
		
		System.out.println("The circumference is: " + circumference);
		
		System.out.println("The squareroot of pi is : " + Math.sqrt(Math.PI));
		
		
		
		}
}
