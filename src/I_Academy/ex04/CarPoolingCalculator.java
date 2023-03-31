package I_Academy.ex04;

import java.util.Scanner;

public class CarPoolingCalculator {
    public static void main(String[] args) {
        double milesPerDay;
        double gasCost;
        double milesPerGallon;
        double parkingFees;
        double tollsPerDay;
        double carPoolingCost;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the miles driven per day: ");
        milesPerDay  = input.nextDouble();

        System.out.println("Enter the gasoline cost: ");
        gasCost = input.nextDouble();

        System.out.println("Enter the miles per gallon: ");
        milesPerGallon = input.nextDouble();

        System.out.println("Enter the parking fees: ");
        parkingFees = input.nextDouble();

        System.out.println("Enter the tolls per day: ");
        tollsPerDay = input.nextDouble();

        carPoolingCost = (milesPerDay / milesPerGallon) * gasCost + parkingFees + tollsPerDay;
        System.out.printf("Your car pooling cost is: %.2f", carPoolingCost);
    }
}
