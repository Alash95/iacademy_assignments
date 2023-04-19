package I_Academy.abstraction.shape;

public class Square extends TwoDimensionalShape{

    private double length;

    public Square(double length) {
        if (length < 0) {
            throw new IllegalArgumentException("Length cannot be negative");
        }
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length < 0) {
            throw new IllegalArgumentException("Length cannot be negative");
        }
        this.length = length;
    }

    @Override
    public double getArea() {
        return Math.pow(getLength(), 2);
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + getLength() +
                "area=" + getArea() +
                '}';
    }
}
