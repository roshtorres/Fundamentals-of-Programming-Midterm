package javaPackage;
import java.util.Scanner; 
import java.text.DecimalFormat;

public class _13InputOutputComputation_NetPrice
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###,###.00");
		
		// Initialize our variables that will handle our inputs
		String product = ""; // null value is assigned
		double unitPrice = 0.0; // zero is the initial value
		double quantity = 0.0;
		
		// Initialize variable we used for computation
		double totalPrice = 0.0;
		double discount = 0.0; double netPrice = 0.0;
		
		System.out.print("Enter product: ");
		product = input.nextLine();
		
		System.out.print("Enter unit price: ");
		unitPrice = input.nextDouble();
		
		System.out.print("Enter quantity: ");
		quantity = input.nextDouble();
		
		totalPrice = quantity * unitPrice;
		discount = totalPrice * 0.1;
		netPrice = totalPrice - discount;
		
		System.out.println("\nThe product is " + product);
		System.out.println("Total Price is " + df.format(totalPrice) 
											+ " dollars");
		System.out.println("Discount is " + df.format(discount) + " dollars");
		System.out.println("\nNet price is " + df.format(netPrice) + " dollars");
	}

}
