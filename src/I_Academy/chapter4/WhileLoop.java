package I_Academy.chapter4;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        int studentCounter = 1;
        int score;
        double classAverage;
        int totalScore = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter student %d's score\n", studentCounter);
        score = scanner.nextInt();
        totalScore = totalScore + score;
        while (studentCounter < 10) {
            studentCounter++;
            System.out.printf("Enter student %d's score\n", studentCounter);
            score = scanner.nextInt();
            totalScore = totalScore + score;
        }
        classAverage = (double) totalScore / 10;
        System.out.println(classAverage);
    }
}
