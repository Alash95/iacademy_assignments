package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {

    public static void main(String[] args) {
        int[][] sum = {{1, 2, 3}, {4, 5, 6}, {9, 8, 9}};
        List<List<Integer>> arr1 = new ArrayList<>();
        for (int i = 0; i < sum.length; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < sum[i].length; j++) {
                row.add(sum[i][j]);
            }
            arr1.add(row);
        }
        System.out.println(diagonalDifference(arr1));
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int n = arr.size();

        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr.get(i).get(i);
            sum2 += arr.get(i).get(n-1-i);
        }
        return Math.abs(sum1 - sum2);
    }

    }
/**
 * 1 2 3
 * 4 5 6
 * 9 8 9
 */
