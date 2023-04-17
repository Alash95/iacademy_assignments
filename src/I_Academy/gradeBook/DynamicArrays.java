package I_Academy.gradeBook;

import java.util.ArrayList;
import java.util.Collections;

public class DynamicArrays {
    public static void main(String[] args) {
        Integer age = 5;
        String address = "Infinity House";
        Long id = 1234567890L;

        String[] students = new String[]{"Noah", "Sarah", "Oyin", "Tobi", "Chidinma", "Adeolu", "Joaquim", "Kenny", "Ridoh", "Moses"};
        ArrayList<String> studentList = new ArrayList<>();

        Collections.addAll(studentList, students);
        System.out.println(studentList);

        Integer[] studentsList = new Integer[] {98, 84, 67, 23,45, 35};
        System.out.println(convertArrayToArrayList(studentsList));

    }

    public static ArrayList<Integer> convertArrayToArrayList(Integer[] array){
        ArrayList<Integer> list = new ArrayList<>();
        for (int element: array){
            list.add(element);
        }
        return list;

    }




}
