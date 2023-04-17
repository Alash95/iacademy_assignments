package I_Academy.OOP_Classwork.ex9_6;

public class Square extends TwoDimensionalShapes{


    public Square(String nameOfShape, double length, double width) {
        super(nameOfShape, length, width);
    }

    public double calculateArea() {
        return getLength() * getWidth();
    }

    public double calculatePerimeter() {
        return 2 * (getLength() + getWidth());
    }

    @Override
    public String toString() {
        return "{" +
                "Name of Shape=" + getNameOfShape() +
                ", area=" + calculateArea() +
                ", perimeter=" + calculatePerimeter() +
                '}';
    }
}
