package Assignment_Day3.OnlineBankingSystem;

import java.util.StringJoiner;

class Account {
    private long accountNo;
    private String accountHolder;
    private double balance;

    public Account(long accountNo, String accountHolder, double balance) {
        this.accountNo = accountNo;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class SavingsAccount extends Account {

    private double interest;

    public SavingsAccount(long accountNo, String name, double balance) {
        super(accountNo, name, balance);
    }

    public void calculateInterest() {
        this.interest = (this.getBalance() * 0.1) / 100;
        System.out.println("Your current interest: " + this.interest);
    }
}

class CurrentAccount extends Account {
    private double maxAmount;

    public CurrentAccount(long accountNo, String name, double balance) {
        super(accountNo, name, balance);
        this.maxAmount = 1500000;
    }

    public void overDraft() {
        if (this.getBalance() > this.maxAmount) {
            System.out.println("Your Account is overDrafted");
        } else {
            System.out.println("You can still add balance");
        }
    }
}

public class OnlineBankingSystem {
    public static void main(String[] args) {
        SavingsAccount acc1 = new SavingsAccount(1001, "tamil", 432323);
        CurrentAccount acc2 = new CurrentAccount(1002, "king", 523943);
        acc1.calculateInterest();
        acc2.overDraft();
    }
}
