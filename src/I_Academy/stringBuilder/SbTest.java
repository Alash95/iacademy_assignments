package I_Academy.stringBuilder;

import java.util.*;

public class SbTest {
    public static void main(String[] args) {
        String firstName = "Afogu";
        String newFirstName = firstName.toLowerCase();
        System.out.println(firstName);
        System.out.println(newFirstName);
        newFirstName.toUpperCase();
        System.out.println(newFirstName);

        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder("You are welcome to i-academy");
        StringBuilder sb2 = new StringBuilder(10);
//        sb1.reverse();
//        System.out.println(sb1);
        sb1.toString().toUpperCase();
        System.out.println(sb1);
        sb1.length();
        System.out.println(sb1.length());
        sb1.capacity();
        System.out.println(sb1.capacity());
//        sb1.setLength(50);
//        System.out.println(sb1);


        System.out.println(sb1.charAt(5));
        sb1.setCharAt(6, 'z');
        System.out.println(sb1);

        char[] myArray = new char[sb1.length()];
        sb1.getChars(4, 11, myArray, 0);
        System.out.println(Arrays.toString(myArray));

        String str = "iacademy";
        System.out.println(reverseString("Oyinlola"));
        System.out.println(reverseString1("iacademy"));
        System.out.println(reverseStringUsingArrayList(str));
        System.out.println(reverseStringUsingStack("musa"));
        System.out.println(isPalindromeChecker("musa"));
        System.out.println(isPalindromeStringBuilder("racecar"));
        System.out.println(isPalindromeUsingStack("iacademy"));
    }

    public static String reverseString(String str) {
        StringBuilder sb1 = new StringBuilder(str);
        return sb1.reverse().toString();
    }

    public static String reverseString1(String str) {

        String reversedString = "";
        for (int i = str.length()-1; i >= 0  ; i--) {
            reversedString += str.charAt(i);

        }
        return reversedString;
    }

    public static String reverseStringUsingArrayList(String str) {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        Collections.reverse(list);
        return list.toString();
    }

    public static String reverseStringUsingStack(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        Collections.reverse(stack);
        return stack.toString();
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < stack.size(); i++) {
//            sb.append(stack.pop());
//        }
//        return sb.toString();
    }

    public static boolean isPalindromeChecker(String str) {
        int front = 0, back = str.length()-1;
        boolean result = false;
        while (front < back) {
            if (str.charAt(front) != str.charAt(back)) {
                return false;
            }
            front++;
            back--;
        }
        return true;

    }

    public static boolean isPalindromeStringBuilder(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return str.equalsIgnoreCase(sb.toString());
    }

    public static boolean isPalindromeUsingStack(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        Iterator<Character> iterator = stack.iterator();
        while (iterator.hasNext()){
            sb.append(stack.pop());
        }
        System.out.println(sb);
        return str.equalsIgnoreCase(sb.toString());
    }
}

/**
 * create a method that accepts a string as a parameter and returns a string but reverses a string as its parameter
 * create a method that reverses a string.
 */
/**
 * create a method that checks if a string is a palindrome
 */
