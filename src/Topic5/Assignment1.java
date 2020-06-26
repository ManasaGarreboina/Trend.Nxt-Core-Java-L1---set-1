package Topic5;

import Topic5.test.Foundation;

public class Assignment1 {
	public static void main(String[] args)
	{
		Foundation obj=new Foundation();
		System.out.println("Private variable var1 is not accessible");
		System.out.println("Default variable var2 is not accessible");
		System.out.println("Protected variable var3 is not accessible");
		System.out.println("Public variable var4 is  accessible.The value is "+obj.var4);
	

	}
}
