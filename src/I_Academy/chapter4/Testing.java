package I_Academy.chapter4;

import java.util.Scanner;

public class Testing {

    public static String displayGrade() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a score");
        int score = scanner.nextInt();
        String grade = "";

        switch (score / 10) {
            case 9, 8, 7:
                grade = "A";
                break;
            case 6:
                grade = "B";
                break;
            case 5:
                grade = "C";
                break;
            default:
                grade = "F";
        }
        System.out.println(grade);
        return grade;
    }

    public static void main(String[] args) {
        displayGrade();
    }
}
