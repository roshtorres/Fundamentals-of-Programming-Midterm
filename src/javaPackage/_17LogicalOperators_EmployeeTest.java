package javaPackage;
import java.util.Scanner; 

public class _17LogicalOperators_EmployeeTest
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int test1score = 0, test2score = 0;
		
		System.out.print("Enter test 1 score: ");
		test1score = input.nextInt();
		
		System.out.print("Enter test 2 score: ");
		test2score = input.nextInt();
		
		if ((test1score > 90) && (test2score > 90))
		{
			System.out.println("\nMake employee manager ");
		}
		else if ((test1score > 90) || (test2score > 90))
		{
			System.out.println("\nMake employee supervisor ");
		}
		else if (! (test1score > 90))
		{
			System.out.println("\nMake no promotions ");
		}
		System.out.println("The program terminates");
	}

}
