package I_Academy.exceptions_example;

import java.util.Scanner;

public class CircleException {
    private int radius;

    public CircleException(){

    }

    public CircleException(int radius){
        this.radius = radius;
    }
    public double area(int radius) {
        if (radius > 0) {
            return Math.PI * Math.pow(getRadius(), 2);
        }
        throw new ArithmeticException("Radius must not be leass than 0 or equal to 0");
    }

    public double perimeter(int radius) {
        if (radius > 0) {
            System.out.println(radius);
            return 2 * Math.PI * getRadius();
        }
        throw new ArithmeticException("Radius must not be leass than 0 or equal to 0");
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) throws ArithmeticException{
        this.radius = radius;
    }

    public static void main(String[] args) {
        CircleException circleException = new CircleException();
        System.out.println("Welcome");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a radius");
        int radius = scanner.nextInt();
        circleException.setRadius(radius);
        System.out.println(circleException.getRadius());
        System.out.println("Area is" +circleException.area(radius));
        System.out.println("Perimeter is" + circleException.perimeter(radius));


    }
}
