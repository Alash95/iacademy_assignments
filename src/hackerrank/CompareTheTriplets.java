package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {

    public static void main(String[] args) {
        int[] a = {17, 28, 30};
        int[] b = {99, 16, 8};

        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();
        for(Integer arrays: a){
            A.add(arrays);
        }
        for(Integer arrays: b) {
            B.add(arrays);
        }
        System.out.println(compareTriplets(A,B));
    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int[] points = new int[2];

        for (int i = 0; i < a.size(); i++) {
                if (a.get(i) < b.get(i)){
                    points[1]+=1;
                }
                if (a.get(i) > b.get(i)){
                    points[0]+=1;
                }
            }
        return Arrays.asList(points[0], points[1]);
    }
}

/**
 * Sample Input
 *
 * 5 6 7
 * 3 6 10
 * Sample Output
 *
 * 1 1
 */
