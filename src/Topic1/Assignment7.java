package Topic1;

import java.util.Scanner;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter a number : ");  
		Scanner scan = new Scanner(System.in);  
		int n = scan.nextInt();  
		int fact = 1;  
		System.out.println("Factorial value of " + n + " using RECURSION is " + getFactorial(n));  
	}  

	static int getFactorial(int num) {  
		if (num <= 1)  
			return 1;  
		else 
			return (num * getFactorial(num - 1));  
	}

}
