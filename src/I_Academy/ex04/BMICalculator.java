package I_Academy.ex04;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {

        double height;
        double weight;
        double bmi;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your height: ");
        height = input.nextDouble();

        System.out.println("Enter your weight: ");
        weight = input.nextDouble();

        bmi = (weight / (height * height));
        System.out.printf("Your BMI is : %.2f", bmi);
    }
}
