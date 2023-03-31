package I_Academy.chapter4;

import java.util.Arrays;

public class Strings {

    public static void main(String[] args) {
//        String name = "    iacademy    ";
//        String anotherWay = new String("iacademy");
//        System.out.println(name == anotherWay);
//        System.out.println(name.equals(anotherWay));
//
//        System.out.println(name.trim());
//        System.out.println(name);
//        System.out.println(name.length());
        System.out.println(isUnique("musa"));
        System.out.println(isUniqueUsingContains("musa"));
        System.out.println(isUniqueUsingArray("Musa"));

/*
Null
single string are all unique
loop through a string vs the substring at index 1 vs i++

Is Unique: implement an algorithm to determine if a string has all unique characters. What if you
cannot use additional data structures?
 */
    }

    public static boolean isUnique(String unique){

        String newString = unique.toLowerCase();
            if (newString.length() == 0 || newString.charAt(1) == 1){
                return true;
            }

        for (int i = 0; i < newString.length(); i++) {
            char currentCharacter = newString.charAt(i);
            int locationOfCurrentCharacter = newString.substring(i+1).indexOf(currentCharacter);
            if (locationOfCurrentCharacter != -1) {
                return false;
            }
        }
        return true;
    }

    public static boolean isUniqueUsingContains(String str) {
        String newString = str.toLowerCase();
        for (int i = 0; i < newString.length(); i++) {
            char currentCharacter = newString.charAt(i);
            return !newString.substring(i+1).contains(String.valueOf(currentCharacter));
        }
        return true;
    }

    public static boolean isUniqueUsingArray(String str) {
        /**
         * convert string to character array
         * sort the array using a custom method (oyinlola - aillnooy)
         */
        String newString = str.toLowerCase();
        char[] strArray =  newString.toCharArray();
        Arrays.sort(strArray);
        for (int i = 0; i < strArray.length - 1; i++) {
            if (strArray[i] == strArray[i+1]){
                return false;
            }
        }
        return true;
    }
}
