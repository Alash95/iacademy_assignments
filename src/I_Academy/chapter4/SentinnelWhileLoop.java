package I_Academy.chapter4;

import java.util.Scanner;

public class SentinnelWhileLoop {
    public static void main(String[] args) {

        int score;
        int totalScore = 0;
        int studentCounter = 0;
        double average;
        int flagValue = -1;

        Scanner scanner  = new Scanner(System.in);
        System.out.printf("Enter score %d\n", studentCounter);
        score = scanner.nextInt();
        while (score != flagValue){
            ++studentCounter;
            totalScore = totalScore + score;
            System.out.printf("Enter score %d\n", studentCounter);
            score = scanner.nextInt();
            System.out.println("Total score is: "+ totalScore);
        }
        if (studentCounter != 0 ) {
            average = (double) totalScore / studentCounter;
            System.out.printf("Total Number of students is %d\nTotal score is %d\nAverage is %.2f",
                    studentCounter, totalScore,average);
        } else {
            System.out.println("No grades were entered");
        }
    }
}
