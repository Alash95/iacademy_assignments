package I_Academy.abstraction.shape;

public class Cube extends ThreeDimensionalShape{

        private double edge;

    public Cube(double edge) {
        if (edge < 0) {
            throw new IllegalArgumentException("Edge cannot be negative");
        }
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        if (edge < 0) {
            throw new IllegalArgumentException("Edge cannot be negative");
        }
        this.edge = edge;
    }

    @Override
    public double getArea() {
        return 6 * Math.pow(getEdge(), 2);
    }

    @Override
    public double getVolume() {
        return Math.pow(getEdge(), 3);
    }

    @Override
    public String toString() {
        return "Cube{" +
                "edge=" + getEdge() +
                ", area=" + getArea() +
                ", volume=" + getVolume() +
                '}';
    }
}
