package I_Academy.chapter4;

import java.util.Arrays;

public class MyArray {
    public static void main(String[] args) {
        String[] nameOfStudents = {"oyin", "tobi", "sarah", "noah", "chidinma", "moses",
            "adeolu", "pelumi", "kenny", "ridoh"};
        System.out.println(nameOfStudents.length);
        System.out.println(nameOfStudents[0]);
        System.out.println(nameOfStudents[4]);

        nameOfStudents[0] = "musa";
        System.out.println(nameOfStudents[0]);

        System.out.println(Arrays.toString(nameOfStudents));

        for (int i = 0; i < nameOfStudents.length; i++) {
            System.out.print(nameOfStudents[i] + ", ");
        }

        int[] ages = new int[4];
        ages = new int[]{1,2,4,5};
    }
}
