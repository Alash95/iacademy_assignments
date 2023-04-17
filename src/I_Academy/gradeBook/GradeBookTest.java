package I_Academy.gradeBook;

public class GradeBookTest {
    public static void main(String[] args) {
        int[] grades = {78,89,95,80,45,89,70,65,20,100};

        GradeBook gradeBook = new GradeBook("Java", grades);
        gradeBook.gradeSummary();
        }
}
