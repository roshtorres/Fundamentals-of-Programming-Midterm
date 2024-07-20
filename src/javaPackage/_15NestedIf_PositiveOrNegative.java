package javaPackage;
import java.util.Scanner;

public class _15NestedIf_PositiveOrNegative 
{
		public static void main(String[] args)
		{
			Scanner input = new Scanner(System.in);
			int number;
			
			System.out.print("Enter number: ");
			number = input.nextInt();
			
			if (number > 0)
			{
				System.out.println("\n" + number + " is a positive number");
			}
			else if (number < 0)
			{
				System.out.println("\n" + number + "  is a negative number");
			}
			else
			{
				System.out.println("\n" + number + "  is an origin");
			}
			System.out.println("Hello");
		}

}

