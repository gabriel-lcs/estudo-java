package entities;

public class Account {
    private int numberAcc;
    private double saldo;
    private String name;

    public Account(int numberAcc, double saldo, String name) {
        this.numberAcc = numberAcc;
        this.saldo = saldo;
        this.name = name;
    }

    public int getNumberAcc() {
        return numberAcc;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deposito(double saldo){
            this.saldo += saldo;
    }

    public void saque(double saldo){
        this.saldo -= saldo + 5;
    }

    public String toString(){
        return String.format("Account %d, Holder: %s, Balance: $ %.2f%n", numberAcc, name, saldo);
    }
}