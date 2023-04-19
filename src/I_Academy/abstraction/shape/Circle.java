package I_Academy.abstraction.shape;

public class Circle extends TwoDimensionalShape{

    private double radius;

    public Circle(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("radius cannot be negative");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("radius cannot be negative");
        }
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + getRadius() +
                "area=" + getArea() +
                '}';
    }
}
