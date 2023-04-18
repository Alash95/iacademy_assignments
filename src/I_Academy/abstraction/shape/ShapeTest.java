package I_Academy.abstraction.shape;

import I_Academy.OOP_Classwork.ex9_6.ThreeDimensionalShapes;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];

        shapes[0] = new Circle(3);
        shapes[1] = new Square(4);
        shapes[2] = new Triangle(4, 6);
        shapes[3] = new Cube(3);
        shapes[4] = new Sphere(9);
        shapes[5] = new Tetrahedron(8);

        for (Shape shape: shapes) {
            System.out.println(shape);

            if (shape instanceof TwoDimensionalShape) {
                TwoDimensionalShape twoDimensionalShape = (TwoDimensionalShape) shape;
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
