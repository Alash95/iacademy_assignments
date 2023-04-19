package I_Academy.OOP_Classwork.Online_ex2;

public class CourseWorkMark {

    private Course course;
    private String quiz;
    private String test;
    private String project;

    public CourseWorkMark(Course course, String quiz, String test, String project) {
        this.course = course;
        this.quiz = quiz;
        this.test = test;
        this.project = project;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getQuiz() {
        return quiz;
    }

    public void setQuiz(String quiz) {
        this.quiz = quiz;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "CourseWorkMark{" +
                "course=" + getCourse() +
                ", quiz='" + getQuiz() + '\'' +
                ", test='" + getTest() + '\'' +
                ", project='" + getProject() + '\'' +
                '}';
    }
}
