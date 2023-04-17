package Tutorials.arrays;

public class ObjectArray {
    public static void main(String[] args) {

//        Object a[] = new Object[5];
//
//        a[0] = 10; // integer
//        a[1] = 20.5; // double
//        a[2] = "welcome"; //string
//        a[3] = 'G';
//        a[4] = true;

        Object a[] = {100, 345.678, "welcome", 'A', true, 300, 506.66};
        for (Object elements: a){
            System.out.println(elements);
        }
    }
}
