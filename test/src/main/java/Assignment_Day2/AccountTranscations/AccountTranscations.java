package Assignment_Day2.AccountTranscations;

import java.util.Scanner;
class Account{
    private String accountNumber;
    private int balance;

    public Account(String accountNumber,int balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber  = accountNumber;
    }
    public void setBalance(int balance)
    {
        this.balance = balance;
    }
    public String getAccountNumber()
    {
        return this.accountNumber;
    }
    public int getBalance()
    {
        return this.balance;
    }
}

class Transcation extends Account
{
    public Transcation(String accountNumber,int balance)
    {
        super(accountNumber,balance);
    }
    public void withdrawAmount(int amount)
    {
        int balance = this.getBalance();
        if(balance>amount)
        {
            balance -=amount;
            this.setBalance(balance);
            System.out.println("Amount Withdrawl successful");
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
        System.out.println("Your balance: "+balance);
    }
    public void depositAmount(int amount)
    {
        int balance = this.getBalance();
        this.setBalance(balance+amount);
        System.out.println("Deposite Successful");
        System.out.println("Your balance: "+(balance+amount));
    }
}

public class AccountTranscations {
    public static void main(String[] args) {
        Transcation obj = new Transcation("5738292472",5000);
        int x, amount;
        Scanner sc =new Scanner(System.in);
        while(true)
        {
            System.out.print("1. Withdrawl   2.Deposite  0.Exit\n Enter Your choice: ");
            x = sc.nextInt();
            System.out.print("Enter the amount: ");
            amount = sc.nextInt();
            switch (x)
            {
                case 1:
                    obj.withdrawAmount(amount);
                    break;
                case 2:
                    obj.depositAmount(amount);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("enter valid option : )");

            }
        }
    }
}
