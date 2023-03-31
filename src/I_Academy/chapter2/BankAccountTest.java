package I_Academy.chapter2;

import java.util.Scanner;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Tobilola Ojukwu", 17000);
        System.out.printf("Congrats! Your account name is %s\nYour balance is %.2f", bankAccount.getAccountName()
                , bankAccount.getAccountBalance());

        Scanner scanner = new Scanner(System.in);

        String name;
        double balance;
        System.out.println("Enter your account name; ");
        name = scanner.nextLine();

        System.out.println("Enter initial balance: ");
        balance = scanner.nextDouble();

        BankAccount bankAccount1 = new BankAccount(name, balance);
        System.out.printf("Congrats! Your account name is %s\nYour balance is %.2f", bankAccount1.getAccountName()
                , bankAccount1.getAccountBalance());

        System.out.println("How much do you want to deposit: ");
        double depositAmount = scanner.nextDouble();
        bankAccount1.deposit(depositAmount);
        System.out.printf("Congrats! Your account name is %s\nYou've added %.2f to your account\nYour balance is %.2f", bankAccount1.getAccountName()
                ,depositAmount, bankAccount1.getAccountBalance());

        System.out.println("How much do you want to withdraw: ");
        double debitAmount = scanner.nextDouble();
        bankAccount1.debit(debitAmount);
        System.out.printf("Congrats! Your account name is %s\nYou have withdrawn %.2f\nYour balance is %.2f", bankAccount1.getAccountName()
                ,debitAmount, bankAccount1.getAccountBalance());

    }
}
