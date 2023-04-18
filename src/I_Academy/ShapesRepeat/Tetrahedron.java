package I_Academy.ShapesRepeat;

public class Tetrahedron extends ThreeDimensionalShape{

    private double edge;

    public Tetrahedron(double edge) {
        this.edge = Math.abs(edge);
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = Math.abs(edge);
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) * Math.pow(getEdge(), 2));
    }

    @Override
    public double getVolume() {
        return (Math.pow(getEdge(), 3) / (6 * Math.sqrt(2)));
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
