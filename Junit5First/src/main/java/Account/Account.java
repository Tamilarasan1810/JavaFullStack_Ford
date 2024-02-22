package Account;

public class Account {
    private int balance;
    public int getBalance()
    {
        return this.balance;
    }
    public void deposit(int amount)
    {
        if(amount>0)
        {
            this.balance+=amount;
            System.out.println("Balance added Successfully");
        }
        if(amount ==0)
        {
            System.out.println("Update is not required");
        }
    }
}
