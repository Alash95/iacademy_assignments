package I_Academy_Assessments.ex06_30;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * 6.30 (Guess the Number) Write an application that plays “guess the number” as follows: Your
 * program chooses the number to be guessed by selecting a random integer in the range 1 to 1000.
 * The application displays the prompt Guess a number between 1 and 1000. The player inputs a first
 * guess. If the player's guess is incorrect, your program should display Too high. Try again. or Too
 * low. Try again. to help the player “zero in” on the correct answer. The program should prompt the
 * user for the next guess. When the user enters the correct answer, display Congratulations. You
 * guessed the number!, and allow the user to choose whether to play again. [Note: The guessing technique
 * employed in this problem is similar to a binary search, which is discussed in Chapter 19, Searching, Sorting and Big O.]
 */
public class GuessTheNumber {
    public static void main(String[] args) {

        numberGuess();
    }

    public static int numberGuess() {
        SecureRandom random = new SecureRandom();
        int correctNumber =  1 + random.nextInt(1000);
        System.out.println(correctNumber);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int guessNumber =  scanner.nextInt();

        while (guessNumber != -1) {
            if (guessNumber == correctNumber){
                System.out.println("Congratulations, play again or press -1 to exit");
                correctNumber =  1 + random.nextInt(1000);
                System.out.println(correctNumber);
            }
            else if (guessNumber < correctNumber){
                System.out.println("Too Low Try Again");
            }
            else {
                System.out.println("Too high try again");
            }
            System.out.println("Enter an integer");
            guessNumber = scanner.nextInt();
        }
        return guessNumber;
    }
}
