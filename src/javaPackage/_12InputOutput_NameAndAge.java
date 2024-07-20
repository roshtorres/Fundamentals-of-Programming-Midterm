package javaPackage;
import java.util.Scanner;

public class _12InputOutput_NameAndAge 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String name;
		int age;
		
		System.out.print("Enter name: ");
		name = input.nextLine();
		
		System.out.print("Enter age: ");
		age = input.nextInt();
		
		System.out.println();
		System.out.println("Your name is " + name);
		System.out.println("You are " + age + " years old");
	}

}
