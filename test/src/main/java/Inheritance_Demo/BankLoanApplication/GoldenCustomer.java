package Inheritance_Demo.BankLoanApplication;

public class GoldenCustomer extends Customer{
    private int goldCount;
    public GoldenCustomer(String name,long phone,int goldCount)
    {
        super(name,phone);
        this.goldCount = goldCount;
    }
    public int getGoldCount()
    {
        return this.goldCount;
    }
    public void customerInfo()
    {
        super.customerInfo();
        System.out.println("Golden Customer memberships: "+goldCount);

    }
}
