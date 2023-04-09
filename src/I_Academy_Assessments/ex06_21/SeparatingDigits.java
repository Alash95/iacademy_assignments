package I_Academy_Assessments.ex06_21;

import java.util.Scanner;

/**
 * 6.21 (Separating Digits) Write methods that accomplish each of the following tasks:
 * a) Calculate the integer part of the quotient when integer a is divided by integer b.
 * b) Calculate the integer remainder when integer a is divided by integer b.
 * c) Use the methods developed in parts (a) and (b) to write a method displayDigits that
 * receives an integer between 1 and 99999 and displays it as a sequence of digits, separating
 * each pair of digits by two spaces. For example, the integer 4562 should appear as
 *                                  4  5  6  2
 * Incorporate the methods into an application that inputs an integer and calls displayDigits by passing the
 * method the integer entered. Display the results.
 */

public class SeparatingDigits {

    public static void main(String[] args) {
        displayDigits(99999);
        int num = 4562 % 10;
        System.out.println(num);

    }

    public static int quotient(int a, int b) {
        return a / b;
    }

    public static int remainder(int a, int b) {
        return a % b;
    }

    public static String displayDigits(int number) {
        String result = "";


        while (number != 0) {
            int remainder = remainder(number, 10);
            number = quotient(number, 10);
            result = remainder + "  " + result;
        }
        System.out.println(result);
        return result;
    }
}
