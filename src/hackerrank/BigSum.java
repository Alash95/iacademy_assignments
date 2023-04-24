package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BigSum {

    public static void main(String[] args) {
        Long[] longArray = {1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L};
        List<Long> longList = new ArrayList<>(Arrays.asList(longArray));
        System.out.println(aVeryBigSum(longList));
    }

    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        Long sum = 0L;
        for (Long aLong : ar) {
            sum += aLong;
        }

        return sum;

    }
}

/**
 * 5
 * 1000000001 1000000002 1000000003 1000000004 1000000005
 * Output
 * 5000000015
 */
