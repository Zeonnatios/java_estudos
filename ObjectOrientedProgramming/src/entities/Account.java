package entities;

public class Account {

    private String holder;
    private final int number;
    private double balance;

    public Account(String holder, Integer number, double initialDeposite) {
        this.holder = holder;
        this.number = number;
        deposit(initialDeposite);
    }

    public Account(String holder, Integer number) {
        this.holder = holder;
        this.number = number;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        double TAX = 5.00;
        this.balance -= amount + TAX;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Integer getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account { " +
                "Holder = '" + holder + '\'' +
                ", Number = " + number +
                ", Balance = $ " + String.format("%.2f", balance) +
                " }";
    }
}
