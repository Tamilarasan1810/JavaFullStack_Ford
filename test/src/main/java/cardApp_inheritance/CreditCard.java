package cardApp_inheritance;

import java.util.*;

public class CreditCard extends Card {
    private double creditLimit;
    private int rewardPoints;
    private String cardHolderName;
    private double purchases[];

    private int billingDays;

    public CreditCard(long cardNum, String cardType, String cardName, String cardExpiryDate, double creditLimit, String cardHolderName, int billingDays) {
        super(cardNum, cardType, cardName, cardExpiryDate);
        this.creditLimit = creditLimit;
        this.cardHolderName = cardHolderName;
        this.billingDays = billingDays;
    }

    /*public void purchaseUpdate(int purchaseAmmount)
    {
        this.purchases[this.purchaseIndex++]=purchaseAmmount;
        this.creditLimit -=purchaseAmmount;
        if(purchaseAmmount>1000)
        {
            updateRewardPoints();
        }
    }
    public void availableCreditLimit()
    {
        System.out.println("Your Available Credit Balance: "+this.creditLimit);
    }
    public void updateRewardPoints()
    {
        this.rewardPoints+=1;
    }
    public void claimReward(int claimedReward)
    {
        this.rewardPoints -=claimedReward;
    }*/

}
