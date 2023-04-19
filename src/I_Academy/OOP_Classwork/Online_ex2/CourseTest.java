package I_Academy.OOP_Classwork.Online_ex2;

public class CourseTest {

    public static void main(String[] args) {

        Course course = new Course("English", 90);
        CourseWorkMark courseWorkMark = new CourseWorkMark(course,"Java", "Polymorphism", "Discuss Polymorphism");

        System.out.println(courseWorkMark);
        System.out.println(course);
    }
}
