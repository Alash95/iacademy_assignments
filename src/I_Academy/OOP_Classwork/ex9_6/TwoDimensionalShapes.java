package I_Academy.OOP_Classwork.ex9_6;

public class TwoDimensionalShapes extends Shape{

    private double length;
    private double width;

    public TwoDimensionalShapes(String nameOfShape, double length, double width) {
        super(nameOfShape);
        validateLength(length);
        this.length = length;
        validateWidth(width);
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        validateLength(length);
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        validateWidth(width);
        this.width = width;
    }

    public void validateLength(double length) {
        if (length < 0) {
            throw new IllegalArgumentException("Length must be greater than 0");
        }
    }

    public void validateWidth(double width) {
        if (width < 0) {
            throw new IllegalArgumentException("Width must be greater than 0");
        }
    }

    @Override
    public String toString() {
        return "TwoDimensionalShapes{" +
                "Name of Shape="+ getNameOfShape()+
                "length=" + getLength() +
                ", width=" + getWidth() +
                '}';
    }
}
