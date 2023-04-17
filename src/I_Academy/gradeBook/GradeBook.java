package I_Academy.gradeBook;

import java.util.Arrays;

public class GradeBook {

    private String courseName;
    private int[] grades;

    public GradeBook(String courseName, int[] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getMinimumGrades(){
//        int lowest = Integer.MAX_VALUE;
//        for (int i = 0; i < grades.length; i++) {
//            if (grades[i] < lowest){
//                lowest = grades[i];
//            }
//        }
//        for (int grade: grades){
//            if (grade < lowest){
//                lowest = grade;
//            }
//        }
        Arrays.sort(grades);
        return grades[0];
    }

    public int getMaximumGrade(){
        int highest = Integer.MIN_VALUE;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > highest){
                highest = grades[i];
            }
        }

        for (int grade: grades){
            if (grade > highest) {
                highest = grade;
            }
        }
        Arrays.sort(grades);
        return grades[grades.length-1];
    }

    public double getAverage(){
        int sum = 0;
        for (int grade: grades){
            sum += grade;
        }
        return sum/grades.length;
    }

    public void outputGrades(){
        for (int i = 0; i < grades.length; i++){
            System.out.printf("Student %d grade: %d\n", i+1, grades[i]);
        }
    }
    public void gradeSummary(){
        System.out.printf("CourseName: %s\nLowest grade: %d\nHighestGrade: %d\nAverage: %.2f", getCourseName(),getMinimumGrades(),getMaximumGrade(),getAverage());
    }
}
