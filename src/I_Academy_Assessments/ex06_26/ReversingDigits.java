package I_Academy_Assessments.ex06_26;

import java.util.Scanner;

/**
 * 6.26 (Reversing Digits) Write a method that takes an integer value and returns the number with
 * its digits reversed. For example, given the number 7631, the method should return 1367. Incorporate the
 * method into an application that reads a value from the user and displays the result.
 */

public class ReversingDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.close();

        System.out.println(reverse(number));
    }

    public static int reverse(int number) {
        int reversed = 0;

        while (number != 0) {
            int remainder = number % 10;
            number /= 10;

            reversed = reversed * 10 + remainder;
        }
        return reversed;
    }
}
