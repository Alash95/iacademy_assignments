package I_Academy.OOP_Classwork.ex9_6;

public class Shape {

    private String nameOfShape;

    public Shape(String nameOfShape) {
        this.nameOfShape = nameOfShape;
    }

    public String getNameOfShape() {
        return nameOfShape;
    }

    public void setNameOfShape(String nameOfShape) {
        this.nameOfShape = nameOfShape;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "nameOfShape='" + getNameOfShape() + '\'' +
                '}';
    }
}
