package Inheritance_Demo.BankLoanApplication;

public class PremiumCustomer extends Customer{
    private int membershipCount;
    public PremiumCustomer(String name,long phone,int membershipCount)
    {
        super(name,phone);
        this.membershipCount = membershipCount;
    }
    public int getMembershipCount()
    {
        return this.membershipCount;
    }
    public void customerInfo()
    {
        super.customerInfo();
        System.out.println("premium Customer memberships: "+membershipCount);

    }
}
