package leetCode;

public class RomanToInteger {

    public static int romanNumerals(char roman) {

        switch (roman) {
            case 'I' -> {
                return 1;
            }
            case 'V' -> {
                return 5;
            }
            case 'X' -> {
                return 10;
            }
            case 'L' -> {
                return 50;
            }
            case 'C' -> {
                return 100;
            }
            case 'D' -> {
                return 500;
            }
            case 'M' -> {
                return 1000;
            }
            default -> {
            }
        }
        return -1;
//        if (roman == 'I')
//            return 1;
//        if (roman == 'V')
//            return 5;
//        if (roman == 'X')
//            return 10;
//        if (roman == 'L')
//            return 50;
//        if (roman == 'C')
//            return 100;
//        if (roman == 'D')
//            return 500;
//        if (roman == 'M')
//            return 1000;
//        return -1;
    }

    public static int romanToInteger(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int value1 = romanNumerals(str.charAt(i));
            if (i+1 < str.length()) {
                int value2 = romanNumerals(str.charAt(i+1));
                if (value1 >= value2) {
                    sum += value1;
                }
                else {
                    sum -= value1;
                }
            }
            else {
                sum += value1;
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        System.out.println(romanToInteger("DC"));
    }
}
