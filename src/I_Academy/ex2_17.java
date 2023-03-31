package I_Academy;

import java.util.Scanner;

public class ex2_17 {

    public static void main(String[] args) {

        int firstNumber, secondNumber, thirdNumber;
        int smallest, largest;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        firstNumber = scanner.nextInt();

        System.out.println("Enter the second integer: ");
        secondNumber = scanner.nextInt();

        System.out.println("Enter the third integer: ");
        thirdNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber + thirdNumber;
        int average = firstNumber / secondNumber / thirdNumber;
        int product = firstNumber * secondNumber * thirdNumber;

        System.out.println("the sum of the numbers : " + sum);
        System.out.println("the average of the numbers: " + average);
        System.out.println("the product of the numbers: " + product);

        largest = firstNumber;
        if (secondNumber > largest){
            largest = secondNumber;
        }
        if (thirdNumber > largest) {
            largest = thirdNumber;
        }

        smallest = firstNumber;
        if (secondNumber < smallest) {
            smallest = secondNumber;
        }
        if (thirdNumber < smallest) {
            smallest = thirdNumber;
        }

        System.out.println("the largest number is: " + largest);
        System.out.println("the smallest number is: " + smallest);


    }




}

/*
2.17 (Arithmetic, Smallest and Largest) Write an application that inputs three integers from the
user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
representation of the average. So, if the sum of the values is 7, the average should be 2, not
2.3333….]
 */
