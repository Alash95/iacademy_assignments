package Tutorials.arrays;

public class ArrayExample2 {
    public static void main(String[] args) {

        String s[] = new String[3];

        s[0] = "welcome";
        s[1] = "to";
        s[2] = "training";

        /**
         * array.length is a static variable that gives the length of the array elements
         */

        System.out.println(s.length);

        for (String elements: s){
            System.out.println(elements);
        }
    }
}
