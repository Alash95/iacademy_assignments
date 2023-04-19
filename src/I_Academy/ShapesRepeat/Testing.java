package I_Academy.ShapesRepeat;

public class Testing {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];

        shapes[0] = new Circle(4);
        shapes[1] = new Square(5);
        shapes[2] = new Triangle(4, 12);
        shapes[3] = new Cube(6);
        shapes[4] = new Sphere(7);
        shapes[5] = new Tetrahedron(9);

        for (Shape shape: shapes) {
            System.out.println(shape);

            if (shape instanceof TwoDimensionalShape twoDimensionalShape) {
                System.out.printf("Area = %.2f%n%n", twoDimensionalShape.getArea());
            }
            else {
                ThreeDimensionalShape threeDimensionalShape = (ThreeDimensionalShape) shape;
                System.out.printf("Area = %.2f%n%n", threeDimensionalShape.getArea());
                System.out.printf("Volume = %.2f%n%n", threeDimensionalShape.getVolume());
            }
        }
    }
}
