package I_Academy_Assessments.ex06_24;

import java.util.Scanner;

public class PerfectNumber {

    //perfect numbers. the sum of the factors = the number
    //program to get the factors of a given number
    //given a number 6, the factors will divide 6 and g{ive a remainder of 0

    public static void main(String[] args) {
        isPerfect();
        printPerfectNumbers();
    }

    public static int isPerfect() {
        System.out.print("Please enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number) {
            System.out.println(number + " is a perfect number");
        } else {
            System.out.println(number + " is not a perfect number");
        }
        return number;

    }




    public static int printPerfectNumbers() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the minimum: ");
        int min = scanner.nextInt();

//        System.out.println();
        System.out.print("Please enter the maximum: ");
        int max = scanner.nextInt();
        int num;
        for (num = min; num <= max; num++) {
            int sum = 0;

            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            if (sum == num) {
                System.out.println(num + " ");
            }
        }
        return num;

    }
}
