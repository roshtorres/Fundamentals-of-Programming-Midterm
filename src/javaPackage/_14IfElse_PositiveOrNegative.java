package javaPackage;
import java.util.Scanner;

public class _14IfElse_PositiveOrNegative
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
		else
		{
			System.out.println("\n" + number + "  is a negative number");
		}
		System.out.println("The program terminates");
	}

}
