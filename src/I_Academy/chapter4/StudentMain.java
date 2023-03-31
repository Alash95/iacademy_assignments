package I_Academy.chapter4;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student("Oyin", 60);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your grade");
        double grade = input.nextDouble();
        student.setAverage(grade);
        System.out.println("Enter your name");
        String name = input.next();
        student.setName(name);
        System.out.printf("Your name is %s, and your grade is %.2f", student.getName(), student.getAverage());
        System.out.println("Your student grade is " + student.getLetterGrade());

    }
}
