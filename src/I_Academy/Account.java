package I_Academy;

public class Account {
    private String accountName;
    private String accountNumber;
    private String email;
    private String gender;
    private double accountBalance;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void debitAccount() {
        System.out.println("Your account has been debited");
    }

    public void creditAccont() {
        System.out.println("your account has been credited");
    }

    public void displayMessage() {
        System.out.printf("Account name is %s\nAccount number is %s\nUser email is %s\nUser gender is %s\nAccount balance is %.2f",
                accountName, accountNumber, email, gender, accountBalance);
    }

}
