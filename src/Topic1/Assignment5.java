package Topic1;

import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner input = new Scanner(System.in);
	        System.out.print("Input an integer: ");
	        int n = input.nextInt();
	        System.out.println("The sum of the digits is: " + sumDigits(n));

	    }

	    public static int sumDigits(int n) {
	        int sum = 0;
	        while (n != 0) {
	            sum += n % 10;
	            n /= 10;
	        }
	        return sum;

	}

}
