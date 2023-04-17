package Tutorials.arrays;

/**
 * Array is a set of elements which contain same data types, it is a variable which contains many variables.
 *
 * int a[]=new int[5] // Single dimensional array
 * we have elements and indexes in arrays, indexes speaks to the position of the elelments.
 */
public class ArrayExample1 {
    public static void main(String[] args) {

        int a[] = new int[5];

        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        for (int i = 0; i <= 4; i++) {
            System.out.println(a[i]);

        }

        for (int elements: a) {
            System.out.println(elements);
        }
    }
}
