package I_Academy.ShapesRepeat;

public class Square extends TwoDimensionalShape{

    private double length;

    public Square(double length) {
        this.length = Math.abs(length);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = Math.abs(length);
    }

    @Override
    public double getArea() {
        return Math.pow(getLength(), 2);
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + getLength() +
                ", area=" + getArea() +
                '}';
    }
}
