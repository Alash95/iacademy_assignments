package I_Academy_Assessments.ex06_24;

public class PerfectNumber2 {
    public static void main(String[] args) {

        returnPerfectNumber(2000);
    }

    public static int returnPerfectNumber(int n){
        int perfectNumber = 0;
        for (int i = 1; i <= n; i++){
            perfectNumber = perfectNumber(i);
        }
        System.out.println(perfectNumber);
        return perfectNumber;
    }


    public static int perfectNumber(int perfectNumber) {
        int sum = 0;
        for (int i = 1; i <= perfectNumber; i++) {
            if (perfectNumber % i == 0 && perfectNumber != i){
                sum+=i;
            }
        }
        if (sum == perfectNumber) {
            System.out.println((perfectNumber + " is a perfect number"));
        }
        return perfectNumber;
    }


}
