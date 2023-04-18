package I_Academy.ShapesRepeat;

public class Triangle extends TwoDimensionalShape{

    private double base;
    private double height;

    public Triangle(double base, double height) {

        this.base = Math.abs(base);
        this.height = Math.abs(height);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = Math.abs(base);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = Math.abs(height);
    }

    @Override
    public double getArea() {
        return (double) 1/2 * (getBase() * getHeight());
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + getBase() +
                ", height=" + getHeight() +
                ", area=" + getArea() +
                '}';
    }
}
