

import entities.Account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String holder;
        int number;
        double balance = 0;
        String initDeposit = null;
        double deposit;

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter account number: ");
        number = scanner.nextInt();

        System.out.print("Enter account holder: ");
        holder = scanner.next();

        Account account = new Account(number, holder, balance);
        System.out.print("Is there na intial desposit (y/n)? ");
        initDeposit = scanner.next();
        System.out.println();
        if (initDeposit.equals("y")) {
            System.out.print("Enter initial deposit value: ");
            deposit = scanner.nextDouble();
            account.deposit(deposit);
        }
        System.out.println("Accout data: ");
        System.out.println("Accout: "
                + account.getNumber()
                + ", Holder: " + account.getHolder()
                + ", Balance: $" + account.getBalance()
        );


    }
}