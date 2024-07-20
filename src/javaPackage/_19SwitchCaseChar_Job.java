package javaPackage;
import java.util.Scanner;

public class _19SwitchCaseChar_Job 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		String employeeCodeStr = "", employee = "";
		
		//Accept input code
		System.out.print("Enter employee code (A = Agent, L = Team Leader, M = Operations Manager): ");
		employeeCodeStr = input.next();
		
		//Convert lower case into upper case letter
		employeeCodeStr = employeeCodeStr.toUpperCase();
		
		//Declare employeeCodeChar and
		//extract the first letter of employeeCodeStr
		//and store it at employeeCodeChar as its initial value 
		
		char employeeCodeChar = employeeCodeStr.charAt(0);
		switch (employeeCodeChar)
		{
			case 'A': employee = "Agent";
							break;
			case 'L': employee = "Team Leader";
							break;
			case 'M': employee = "Manager";
							break;
			default: employee = "Invalid Code";
		}
		
		//Display output 
		System.out.println("\nEmployee is " + employee);
	}

}
