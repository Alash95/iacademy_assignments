package I_Academy.abstraction.shape;

public class Tetrahedron extends ThreeDimensionalShape{

    private double edge;

    public Tetrahedron(double edge) {
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
        return Math.sqrt(3) * Math.pow(getEdge(), 2);
    }

    @Override
    public double getVolume() {
        return Math.pow(getEdge(), 3) / (6 * Math.sqrt(2));
    }

    @Override
    public String toString() {
        return "Tetrahedron{" +
                "edge=" + getEdge() +
                ", area=" + getArea() +
                ", volume=" + getVolume() +
                '}';
    }
}
