package I_Academy.ShapesRepeat;

public class Sphere extends ThreeDimensionalShape{

    private double radius;

    public Sphere(double radius) {
        this.radius = Math.abs(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = Math.abs(radius);
    }

    @Override
    public double getArea() {
        return 4 * (Math.PI * Math.pow(getRadius(), 2));
    }

    @Override
    public double getVolume() {
        return (double) 4/3 * (Math.PI * (Math.pow(getRadius(), 3)));
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
