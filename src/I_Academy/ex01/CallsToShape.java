package I_Academy.ex01;

public class CallsToShape {

    public static void main(String[] args) {
        Shape circleShape = new Shape();
        circleShape.setRadius(7);
        circleShape.setHeight(6);
        circleShape.setBase(3);


        System.out.println(circleShape.areaOfCircle());
        System.out.println(circleShape.perimeterOfCircle());
        System.out.println(circleShape.areaOfTriangle());


    }
}
