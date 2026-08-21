package entities;

public class SavingsAccount extends Account{

    private Double interestRate;

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(Double balance, String holder, Integer number, Double interestRate) {
        super(balance, holder, number);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }
}
