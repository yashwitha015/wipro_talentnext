package java_fundamentals;

import java.util.Scanner;
public class question_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // --- Part A: Check if number is Positive, Negative, or Zero ---
        System.out.print("Enter an integer number: ");
        int num = sc.nextInt();
        if(num > 0) {
        	System.out.println("The number is Positive.");
        }else if(num < 0) {
        	System.out.println("The number is Negative.");
        }else {
        	System.out.println("The number is Zero.");
        }
        // Part B
        System.out.println("Enter first non-negative number.");
        int num1 = sc.nextInt();
        System.out.println("Enter second non- negative number.");
        int num2 = sc.nextInt();
        if(num1 < 0 || num < 0) {
        	System.out.println("Enter Non-negative Numbers only");
        }else {
        	boolean sameLastDigit = (num1 % 10) == (num2 % 10);
        	System.out.println("Same last digit: " + sameLastDigit);
        }
        sc.close();
	}

}