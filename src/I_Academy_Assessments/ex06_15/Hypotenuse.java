package I_Academy_Assessments.ex06_15;

/**
 * 6.15 (Hypotenuse Calculations) Define a method hypotenuse that calculates the hypotenuse of
 * a right triangle when the lengths of the other two sides are given. The method should take two arguments
 * of type double and return the hypotenuse as a double. Incorporate this method into an
 * application that reads values for side1 and side2 and performs the calculation with the hypotenuse
 * method. Use Math methods pow and sqrt to determine the length of the hypotenuse for each of the
 * triangles in Fig. 6.15. [Note: Class Math also provides method hypot to perform this calculation.]
 */

public class Hypotenuse {

    public static void main(String[] args) {

        hypotenuseCalculation(3.0,4.0);
        hypotenuseCalculation(5.0, 12.0);
        hypotenuseCalculation(8.0, 15.0);
    }

    public static double hypotenuseCalculation(double side1, double side2) {
        int counter = 1;
        double length = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        System.out.printf("%s\t%s\t%s\t%s\n", "Triangle", "Side1", "Side2", "Length");
        System.out.printf("%d %14.2f %8.2f %8.2f\n", counter++, side1, side2, length);
        return length;
    }

}
