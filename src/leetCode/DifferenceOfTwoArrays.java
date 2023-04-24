package leetCode;

import java.util.ArrayList;
import java.util.List;

public class DifferenceOfTwoArrays {

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            int j = 0;
            boolean found = false;
            for (j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                for (int k = i + 1; k < nums1.length; k++) {
                    if (k == i) continue;
                    boolean found2 = false;
                    for (int l = 0; l < nums2.length; l++) {
                        if (nums1[i] == nums2[l] || nums1[k] == nums2[l]) {
                            found2 = true;
                            break;
                        }
                    }
                    if (!found) {
                        List<Integer> difference = new ArrayList<>();
                        difference.add(nums1[i]);
                        difference.add(nums2[k]);
                        result.add(difference);
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] num1 = {1,2,3};
        int[] num2 = {2,4,6};
        List<List<Integer>> result = findDifference(num1, num2);
        System.out.println(result);
    }
}
