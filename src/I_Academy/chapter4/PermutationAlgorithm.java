package I_Academy.chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationAlgorithm {
    public static void main(String[] args) {
        System.out.println(permutation("musa", "asum"));
        System.out.println(permutation2("musa", "asum"));
        System.out.println(urlify("Mr John Smith   "));
        System.out.println(urlify2("Mr John Smith   "));
    }
    /*
    convert the strings to arrays
    loop through the array
    compare the arrays together
     */

    public static boolean permutation(String str1, String str2){
        char[] string1 = str1.toCharArray();
        char[] string2 = str2.toCharArray();
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < string1.length; i++) {
            sum1 += string1[i];
        }
        for (int i = 0; i < string2.length; i++) {
            sum2 += string2[i];
        }
        return sum1 == sum2;
    }

    public static boolean permutation2(String str1, String str2){
        /**
         * convert both str to charArray
         * Arrays.sort to sort both arrays
         * convert the array to string
         * if both sorted arrays are equal
         */

        if (str1.length() != str2.length()){
            return false;
        }
        char[] str1ToArray = str1.toCharArray();
        char[] str2ToArray = str2.toCharArray();
        Arrays.sort(str1ToArray);
        Arrays.sort(str2ToArray);

        String firstArrayToString = Arrays.toString(str1ToArray);
        String secondArrayToString = Arrays.toString(str2ToArray);

        return firstArrayToString.equals(secondArrayToString);
    }

    /**
     * URLify: Write a method to replace all spaces in a string with '%20: You may assume that the string
     * has sufficient space at the end to hold the additional characters, and that you are given the "true"
     * length of the string. (Note: If implementing in Java, please use a character array so that you can
     * perform this operation in place.)
     * EXAMPLE
     * Input:
     * "Mr John Smith
     * "J 13
     * Output: "Mr%20J ohn%20Smith"
     */

    public static String urlify(String str){
        /**
         * convert str to char array
         * use an arraylist to add all elements in the charArray while iterating thru the array
         * if the current char is a space, add %20 to the list
         * convert the list to the string
         */
        char[] urlArray = str.trim().toCharArray();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < urlArray.length; i++) {
            if (urlArray[i] == ' ') {
                list.add("%20");
            }
            list.add(Character.toString(urlArray[i]));
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            result.append(list.get(i));
        }
        return result.toString().replaceAll(" ", "");
    }

    public static String urlify2(String str) {
        return str.trim().replaceAll(" ", "%20");
    }

}
