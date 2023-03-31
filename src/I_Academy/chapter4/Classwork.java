package I_Academy.chapter4;

import java.util.Scanner;

public class Classwork {
    public static void main(String[] args) {
        int result;
        int counter = 1;
        int countPass = 0;
        int countFail = 0;

        Scanner scanner = new Scanner(System.in);

        while (counter <= 10) {
            System.out.println("Enter result: pass==1 and fail==2");
            result = scanner.nextInt();
            if (result == 1) {
                countPass++;
            }else{
                countFail++;
            }
            counter++;
        }
        System.out.printf("Passed: %d\nFailed: %d\n", countPass, countFail);

        if (countPass > 8) {
            System.out.println("Bonus to Instructor");
        }
    }
}

/**
 * Write a program that will print out all even numbers between 0 to 100;
 */
