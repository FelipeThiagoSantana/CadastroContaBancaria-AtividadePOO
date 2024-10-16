

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String holder;
        int number;
        double balance = 0;
        String initDeposit = null;
        double value;


        Locale.setDefault(Locale.US);
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
            value = scanner.nextDouble();
            account.deposit(value);
        }
        System.out.println(" ");
        System.out.println("######################");
        System.out.println(" ");
        System.out.println("Accout: " + account );
        System.out.println(" ");
        System.out.println("######################");
        System.out.println(" ");
        System.out.print("Enter a deposit value: ");
        value =  scanner.nextDouble();
        account.deposit(value);

        System.out.println(" ");
        System.out.println("######################");
        System.out.println("***Updated account data***");
        System.out.print("Account: " + account );
        System.out.println(" ");
        System.out.println("######################");
        System.out.println(" ");

        System.out.print("Enter a withdraw value: ");
        value = scanner.nextDouble();
        account.withdraw(value);

        System.out.println(" ");
        System.out.println("######################");
        System.out.println(" ");

        System.out.println("***Updated account data***");
        System.out.print("Account: " + account );


    }
}