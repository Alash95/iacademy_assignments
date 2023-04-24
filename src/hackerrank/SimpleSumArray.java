package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class SimpleSumArray {

        /*
         * Complete the 'simpleArraySum' function below.
         *
         *
         * The function is expected to return an INTEGER.
         * The function accepts INTEGER_ARRAY ar as parameter.
         */
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6};
        List<Integer> array = new ArrayList<>();
        for(Integer arrays: myArray){

            array.add(arrays);
        }
        System.out.println(simpleArraySum(array));
        }






        public static int simpleArraySum(List<Integer> ar) {
            // Write your code here
            int sum = 0;

            for (Integer integer : ar) {
                sum += integer;
            }
            return Integer.parseInt(String.valueOf(sum));

        }

}
