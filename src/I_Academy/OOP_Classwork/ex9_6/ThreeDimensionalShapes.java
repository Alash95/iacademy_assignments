package I_Academy.OOP_Classwork.ex9_6;

public class ThreeDimensionalShapes extends TwoDimensionalShapes{

    private double height;

    public ThreeDimensionalShapes(String nameOfShape, double length, double width, double height) {
        super(nameOfShape, length, width);
        validateHeight(height);
        this.height = height;
    }

    public void validateHeight(double height) {
        if (height < 0) {
            throw new IllegalArgumentException("height must be greater than 0");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        validateHeight(height);
        this.height = height;
    }

    @Override
    public String toString() {
        return "ThreeDimensionalShapes{" +
                super.toString() +
                "height=" + height +
                '}';
    }
}
