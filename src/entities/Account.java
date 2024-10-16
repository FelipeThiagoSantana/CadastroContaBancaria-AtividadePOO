package entities;

public class Account {
   private int number;
   private String holder;
   private Double balance;
   private double tax = -5.00;


    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }


    public Account(int number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount - tax;

    }


    public String toString (){
        return number
                +
                ","
                +
                " Holder: "
                +
                holder
                +
                ", Balance: $"
                +
                balance;

    }








}
