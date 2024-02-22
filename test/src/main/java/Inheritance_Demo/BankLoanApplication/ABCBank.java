package Inheritance_Demo.BankLoanApplication;

public class ABCBank {
    public double provideLoan(Customer customer, double loanAmount, int noOfYears) {
        //for customer loan amount should be between 1 lakh to 5 lakhs and noOfYears < 10
        //for golden customer loan amount should be between 1 lakh to 10 lakhs and noOfYears < 20
        //for premium customer loan amount should be between 1 lakh to 125 lakhs and noOfYears < 25
        if (customer instanceof PremiumCustomer) {
            PremiumCustomer premiumCustomer = (PremiumCustomer) customer; //downcasting'
            if (premiumCustomer.getMembershipCount() != 0) {
                return loanAmount;
            }
        } else if (customer instanceof GoldenCustomer) {
            GoldenCustomer goldenCustomer = (GoldenCustomer) customer;
            if (goldenCustomer.getGoldCount() != 0) {
                return loanAmount;
            }
        } else {
            return loanAmount;
        }
        return 0;
    }

    /*public double provideLoan(GoldenCustomer customer, double loanAmount, int noOfYears) {

        return 0;
    }

    public double provideLoan(PremiumCustomer customer, double loanAmount, int noOfYears) {

        return 0;
    }*/
}
