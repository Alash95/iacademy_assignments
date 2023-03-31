package I_Academy.chapter4;

public class OddAndEven {

    public static void oddIntegers(){
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.println("odd numbers: " + i);
            }
        }
    }

    public static void evenIntegers() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("even numbers: " + i);
            }
        }
    }

    public static void main(String[] args) {

        oddIntegers();
        evenIntegers();
    }
}
