package I_Academy.chapter2;

public class BankAccount {

    private String accountName;
    private double accountBalance;

    public BankAccount(String accountName, double accountBalance) {
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }

    public void setAccountName(String accountName){
        this.accountName = accountName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountBalance(double accountBalance){
        this.accountBalance = accountBalance;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void deposit(double amount) {
        accountBalance = getAccountBalance() + amount;
    }

    public void debit(double amount) {
        if (amount > getAccountBalance()){
            System.out.println("Insufficient funds");
        }
        else {
            accountBalance = getAccountBalance() - amount;
        }
    }
}
