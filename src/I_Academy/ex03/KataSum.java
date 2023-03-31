package I_Academy.ex03;

import java.util.Scanner;

public class KataSum {

    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        int thirdNumber;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first Number: ");
        firstNumber = input.nextInt();

        System.out.println("Enter your second Number: ");
        secondNumber = input.nextInt();
        
        System.out.println("Enter your third Number: ");
        thirdNumber = input.nextInt();

        int result = firstNumber * secondNumber * thirdNumber;

        System.out.println( "The Product is: " + result);





//        int num1;
//        int num2;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the first integer: ");
//        num1 = scanner.nextInt();
//
//        System.out.println("Enter the second integer: ");
//        num2 = scanner.nextInt();
//        int sum = num1 + num2;
//
//        System.out.println("Sum of numbers is "+ sum);
    }


}
