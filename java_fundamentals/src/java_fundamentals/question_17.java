package java_fundamentals;

import java.util.Scanner;

public class question_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

  
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;
        int temp = Math.abs(number);  

      
        while (temp > 0) {
            sum += temp % 10;    
            temp = temp / 10;    
        }

      
        System.out.println("Sum of digits: " + sum);

        scanner.close();
    }
}