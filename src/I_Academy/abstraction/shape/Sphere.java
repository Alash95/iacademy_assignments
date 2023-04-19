package I_Academy.abstraction.shape;

public class Sphere extends ThreeDimensionalShape{

    private double radius;

    public Sphere(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public double getVolume() {
        return 4/3 * (Math.PI * (Math.pow(getRadius(), 3)));
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "radius=" + getRadius() +
                ", area=" + getArea() +
                ", volume=" + getVolume() +
                '}';
    }
}
