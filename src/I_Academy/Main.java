package I_Academy;

public class Main {
    public static void main(String[] args) {
        Account noahAccount  = new Account();
        Account chidinmaAccount = new Account();
        Account ridohAccount = new Account();

        System.out.println("Before assigning input to variables");
        noahAccount.displayMessage();


        chidinmaAccount.setAccountName("Chidinma Afogu");
        chidinmaAccount.setAccountNumber("0011223344");
        chidinmaAccount.setGender("Female");
        chidinmaAccount.setEmail("chidinma@gmail.com");
        chidinmaAccount.setAccountBalance(70000);
        chidinmaAccount.displayMessage();
    }
}
