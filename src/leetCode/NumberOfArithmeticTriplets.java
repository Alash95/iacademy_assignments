package leetCode;

public class NumberOfArithmeticTriplets {

    public static int numberOfArithmeticTriplets(int[] nums, int diff) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] - nums[i] == diff){
                    for (int k = j+1; k < nums.length; k++) {
                        if (nums[k] - nums[j] == diff){
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,4,6,7,10};
        int diff = 3;
        System.out.println(numberOfArithmeticTriplets(nums, diff));
    }
}

/**
 * You are given a 0-indexed, strictly increasing integer array nums and a positive integer diff.
 * A triplet (i, j, k) is an arithmetic triplet if the following conditions are met:
 *
 * i < j < k,
 * nums[j] - nums[i] == diff, and
 * nums[k] - nums[j] == diff.
 * Return the number of unique arithmetic triplets.
 *
 * You have a list of numbers in increasing order (the next number is always larger than the previous one).
 * You have a number ( diff ). These are the two main parameters.
 *
 * What you're supposed to do is check through the list for 3 numbers x, y, z, such that y - x = diff and z - y = diff.
 * Count how many times you find such numbers throughout the list and return the count.
 */
