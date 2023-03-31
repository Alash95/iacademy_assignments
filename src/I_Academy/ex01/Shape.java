package I_Academy.ex01;

public class Shape {

    private double length;
    private double width;
    private double height;
    private double base;
    private int radius;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double areaOfCircle(){
        double area = Math.PI * getRadius() * getRadius();
        return area;
    }

    public double perimeterOfCircle() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    public double areaOfTriangle() {
        double result = ((1 / 2) * getBase()  * getHeight());
        return result;
    }
}

/*
Create a class "Shape". Assign it the following instance variables:
1 - length
2 - width
3 - height
4 - base
5 - radius

Create setter & getter methods for these instance variable.
Also create methods to find area and perimeter for the following shapes:
* circle
* triangle
* square
* rectangle
 */

/*
Use OOP to model epl
5 objects of the class
club name,
club captain
club coach
club stadium
include a display message method that will display the info of each club.
 */