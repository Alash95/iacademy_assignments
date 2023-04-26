package hackerrank;

public class Staircase {

    public static void main(String[] args) {
        staircase(6);
    }

    public static void staircase(int n) {
        // Write your code here
        int m = 1;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= m; k++) {
                System.out.print("#");
            }
            System.out.println();
            m++;
        }
    }
}

