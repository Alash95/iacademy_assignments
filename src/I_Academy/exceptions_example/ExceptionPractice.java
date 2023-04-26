package I_Academy.exceptions_example;

import java.util.Scanner;

public class ExceptionPractice {

    public static double quotient(int numeratoor, int denominator) throws ArithmeticException {
        return numeratoor / denominator;
    }

    public static double quotient(double numerator, double denominator) {
        if (denominator != 0) {
           return numerator / denominator;
        }
        throw new ArithmeticException("Your denominator should not be less than 1");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to my screen");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int num1 = scanner.nextInt();
        System.out.println("Enter another integer");
        int num2 = scanner.nextInt();
        try {
            System.out.println(quotient(num1, num2));
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("let's try the second method");
        System.out.println("Enter an integer");
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter an integer");
        double secondNumber = scanner.nextDouble();
        try {
            System.out.println(quotient(firstNumber, (double) secondNumber));
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println("Thanks for using this system");
    }
}
