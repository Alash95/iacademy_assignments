package Tutorials.arrays;

public class ArrayExample3 {
    public static void main(String[] args) {

        int a[] = {100, 200, 300, 400, 500};//storing values in an array without limit

        int sum = 0;
        for (int elements: a){
            System.out.println(elements);
            sum += elements;
        }
        System.out.println(sum);
    }
}
