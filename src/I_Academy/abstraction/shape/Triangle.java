package I_Academy.abstraction.shape;

public class Triangle extends TwoDimensionalShape{

    private double base;
    private double height;

    public Triangle(double base, double height) {
        if (base < 0) {
            throw new IllegalArgumentException("base cannot be negative");
        }
        this.base = base;
        if (height < 0) {
            throw new IllegalArgumentException("height cannot be negative");
        }
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base < 0) {
            throw new IllegalArgumentException("base cannot be negative");
        }
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            throw new IllegalArgumentException("height cannot be negative");
        }
        this.height = height;
    }

    @Override
    public double getArea() {
        return 1/2 * (getBase() * getHeight());
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
