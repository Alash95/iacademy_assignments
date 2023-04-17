package I_Academy.methodDeepDive;

import I_Academy.ArrayVideo;

import java.security.SecureRandom;

public class Methods {
    public static int maximumNumber(int num1, int num2, int num3){

        int maximum;

        maximum = num1;
        if (num2 > maximum) {
            maximum = num2;
        }
        if (num3 > maximum) {
            maximum = num3;
        }

        System.out.println("Maximum number is: "+ maximum);

        return maximum;
    }

    public static double maximumNumber(double num1, double num2, double num3){

        double maximum;

        maximum = num1;
        if (num2 > maximum) {
            maximum = num2;
        }
        if (num3 > maximum) {
            maximum = num3;
        }

        System.out.println("Maximum number is: "+ maximum);

        return maximum;
    }

    public static void main(String[] args) {
        maximumNumber(5,8,6);
        ArrayVideo maximum = new ArrayVideo();
        maximumNumber(3.2,4.5, 5.0);
        accountNumber();
        System.out.printf("%.2f\n",area(7));
        System.out.printf("%.2f\n",area(4, 5));
        System.out.printf("%.2f\n",area(4, 5));
        System.out.printf("%.2f\n",area(2,4,5));
    }

    public static long accountNumber(){
        SecureRandom random = new SecureRandom();

        long account = 2023456789L + random.nextInt(2023000000);
        System.out.println(account);

        return account;
    }

    public static double area(int radius) {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public static double area(int length, int breadth) {
        double area = length * breadth;
        return area;
    }

    public static double area(double base, double height) {
        double area = (double) 1 / 2 * base * height;
        return area;
    }

    public static double area(int length, int breadth,  int height) {
        double area = (double)1 / 2 * (length + breadth) * height;
        return area;
    }
}
