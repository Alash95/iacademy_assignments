package I_Academy.chapter4;

import java.util.Scanner;

public class Assignment {
    /**
     * 1. Write a method that determines the number of times a given character appears in a string.
     * 2. Write a method that accepts 5 integers from a user and sums them.
     * 3. Write a java program to calculate the factorial of a given number.
     * 4. Write a method that allows a user to guess the correct pin of an account.
     * When the Pin is correct, display "Correct, welcome back."
     * When incorrect, display "incorrect, try again." When you've run out of attempts,
     * display "sorry, but we've locked you out".
     * @param args
     */
    public static void main(String[] args) {

//        System.out.println(countChar("bobanibi", 'b'));
//        System.out.println(fiveInteger());
//        System.out.println(factorial(5));
        System.out.println(isPinTrueOrFalse());
//        System.out.println(fiveIntegers2());
    }

    public static int countChar(String str, char char1) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == char1) {
                count++;
            }
        }
        return count;
    }

    public static int fiveInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second integer: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter third integer: ");
        int num3 = scanner.nextInt();
        System.out.println("Enter fourth integer: ");
        int num4 = scanner.nextInt();
        System.out.println("Enter fifth integer: ");
        int num5 = scanner.nextInt();

        int sum = num1 + num2 + num3 + num4 + num5;
        return sum;
    }

    public static int fiveIntegers2() {
        int sum = 0;
        int numbers = 0;
        System.out.print("Enter five integers: ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {

            numbers = scanner.nextInt();
            sum += numbers;
        }
        return sum;

    }

    public static int factorial(int num){
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * * 4. Write a method that allows a user to guess the correct pin of an account.
     * * When the Pin is correct, display "Correct, welcome back."
     * * When incorrect, display "incorrect, try again." When you've run out of attempts,
     * * display "sorry, but we've locked you out".
     *
     * @param
     * @param
     * @return
     */
    public static int isPinTrueOrFalse(){

        Scanner scanner = new Scanner(System.in);
        int truePin = 1234;
        int pin = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter your pin: ");
            pin = scanner.nextInt();
            if (truePin == pin) {
                System.out.println("Correct, welcome back");
                break;
            }
            else {
                System.out.println("Incorrect, try again");
            }

            if ((i == 2) && (truePin != pin)) {
            System.out.println("Sorry, but we've locked you out");
            }
        }
        return truePin;

    }
}
