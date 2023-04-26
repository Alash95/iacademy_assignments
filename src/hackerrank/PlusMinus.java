package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class PlusMinus {

    public static void main(String[] args) {

        int[] array = {-4, 3, -9, 0, 4, 1};
        List<Integer> myList = new ArrayList<>();
        for (Integer arr: array) {
            myList.add(arr);
        }

        plusMinus(myList);
    }
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int n = arr.size();
        int count1 = 0, count2 = 0, count3 = 0;
        double sum1 = 0, sum2 = 0, sum3 = 0;

        for (Integer integer : arr) {
            if (integer > 0) {
                System.out.println("count at positive" + count1);
                count1++;
                sum1 = (double) count1 / n;
            } else if (integer < 0) {
                System.out.println("count at negative =" + count2);
                count2++;
                sum2 = (double) count2 / n;
            } else if (integer == 0) {
                System.out.println("count at zero =" + count3);
                count3++;
                sum3 = (double) count3 / n;
            }
        }
        System.out.printf("%.6f\n%.6f\n%.6f", sum1, sum2, sum3);
    }
}
/**
 * positive: , negative:  and zeros: .
 */