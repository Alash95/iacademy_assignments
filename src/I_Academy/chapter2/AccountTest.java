package I_Academy.chapter2;

import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Account account = new Account("Oyinlola");
        Account myAccount = new Account("");

        System.out.println(account.getName());

        System.out.println("Enter your name");
        String name = scanner.nextLine();
        account.setName(name);
        System.out.println("Your name is " + account.getName());

        System.out.println("Enter your name");
        String fullName = scanner.nextLine();
        myAccount.setName(fullName);
        System.out.println("Your name is " + myAccount.getName());


    }


}
