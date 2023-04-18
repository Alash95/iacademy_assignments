package I_Academy.OOP_Classwork.Online_ex2;

public class Course {

    private String courseTitle;
    private int courseWorkMark;

    public Course(String courseTitle, int courseWorkMark) {
        this.courseTitle = courseTitle;
        if (courseWorkMark < 0 || courseWorkMark > 100) {
            throw new IllegalArgumentException("course work mark must be between 0 and 100");
        }
        this.courseWorkMark = courseWorkMark;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public int getCourseWorkMark() {
        return courseWorkMark;
    }

    public void setCourseWorkMark(int courseWorkMark) {
        if (courseWorkMark < 0 || courseWorkMark > 100) {
            throw new IllegalArgumentException("course work mark must be between 0 and 100");
        }
        this.courseWorkMark = courseWorkMark;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseTitle='" + getCourseTitle() + '\'' +
                ", courseWorkMark=" + getCourseWorkMark() +
                '}';
    }
}
