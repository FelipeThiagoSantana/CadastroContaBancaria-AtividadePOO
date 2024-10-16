package entities;

public class Account {
   private int number;
   private String holder;
   private Double balance;
   private double tax = -5.00;

    //Getters and Setters
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

    //Metodo Construtor c/ todos os atributos
    public Account(int number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }
    //Metodo Construtor c/ dois  atributo
    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }
    //Metodo p/ deposito
    public void deposit(double amount) {
        this.balance += amount;
    }
    //Metodo p/ saque
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
                String.format("%.2f", balance);

    }








}
