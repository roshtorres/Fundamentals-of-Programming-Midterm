package javaPackage;

public class _16RelationalOperators_Relational 
{
	public static void main(String[] args)
	{
		int x;
		x = 4;
		int y = 10;
		
		boolean integerEqual;
		boolean integerGreaterThan;
		boolean integerLessThan;
		
		integerLessThan  = x < y;
		integerGreaterThan = y > x;
		integerEqual = x == y;
		integerLessThan = y <= x;
		
		System.out.println(integerEqual);
		System.out.println(integerGreaterThan);
		System.out.println(integerLessThan);
	}

}
