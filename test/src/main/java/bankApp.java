import java.util.*;
class BankAccount{
   private long accNumber;
    private String accHolderName;
    private int accBalance;
    private String accType;
    private int accState;
    //perform deposite and withdrawl operations on creation of an object
    public BankAccount(long accNumber,String accHolderName,int accBalance,String accType,int accState )
    {
        this.accNumber = accNumber;
        this.accHolderName = accHolderName;
        this.accBalance = accBalance;
        this.accType = accType;
        this.accState = accState;
    }
    public void deposite(int amount)
    {
        this.accBalance +=amount;
        System.out.println("Amount deposited Successfully!!!");
        System.out.println("Your account balance is: "+this.accBalance);
    }
    public void withdrawl(int amount)
    {
        if(this.accBalance<amount)
        {
            System.out.println("Not enough balance available!! Your balance is: "+this.accBalance);
        }
        else {
            this.accBalance -= amount;
            System.out.println("Your amount withdrawal successful!!!");
            System.out.println("your account balance is: "+this.accBalance);
        }
    }
}
public class bankApp {
    public static void main(String[] args)
    {
        BankAccount user1 = new BankAccount(424234532,"Tamilarasan",1080,"Savings",1);
        user1.deposite(150);
        user1.withdrawl(2000);
        user1.withdrawl(1000);
    }
}
