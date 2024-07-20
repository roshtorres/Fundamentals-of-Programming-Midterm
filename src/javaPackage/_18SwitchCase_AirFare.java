package javaPackage;
import java.util.Scanner;
import java.text.DecimalFormat;

public class _18SwitchCase_AirFare 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,###.00");
		
		//Declare variables
		double fare = 0.0;
		int customerCode = 0;
		String customer = "";
		double discountRate = 0.0;
		double discount = 0.0;
		double netFare = 0.0;
		
		//Accept the inputs of the program
		System.out.print("Enter fare amount: ");
		fare = input.nextDouble();
		
		System.out.print("Enter customer code (0 = Ordinary, 1 = Student, 2 = Senior): ");
		customerCode = input.nextInt();
		
		switch (customerCode)
		{
			case 0: customer = "Ordinary";
							discountRate = 0.0;
							break;
			case 1: customer = "Student";
							discountRate = 0.1;
							break;
			case 2: customer = "Senior";
							discountRate = 0.2;
							break;
			default: customer = "Invalid code";
		}
		
		//Compute discount and net fare
		discount = fare * discountRate;
		netFare = fare - discount;
		
		//Display output
		System.out.println("\nCustomer is: " + customer);
		System.out.println("Fare is " + df.format(fare) + " dollars");
		System.out.println("Discount is " + df.format(discount) + " dollars");
		System.out.println("\nNet Fare is " + df.format(netFare) + " dollars");
	}

}
