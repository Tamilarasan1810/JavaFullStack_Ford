package Inheritance_Demo.BankLoanApplication;

public class ABCBankAgent {

    public static boolean processLoan(Customer customer,double loanAmount,int noOfYears)
    {
        ABCBank bank = new ABCBank();
        bank.provideLoan(customer,loanAmount,noOfYears);
        return false;
    }

    public static void main(String[] args) {
        PremiumCustomer premiumCustomer = new PremiumCustomer("Tamil",94837483L,10);
        processLoan(premiumCustomer,1500000.00,5);

        GoldenCustomer goldenCustomer = new GoldenCustomer("Chris",729437236L,20);
        processLoan(goldenCustomer,1500000.00,5);
    }
}
