package cardApp_inheritance;

public class Card {
    private long cardNum;
    private String cardType;
    private String cardName;
    private String cardExpiryDate;
    public Card(long cardNum,String cardType,String cardName,String cardExpiryDate)
    {
        this.cardNum = cardNum;
        this.cardType = cardType;
        this.cardName = cardName;
        this.cardExpiryDate = cardExpiryDate;
    }

    public Card() {

    }

    public void getCardInfo()
    {
        System.out.println("cardNum: "+this.cardNum+" cardType: "+this.cardType+" cardName: "+this.cardName+" cardExpiryDate: "+this.cardExpiryDate+"\n");
    }
    public void setCardNum(long cardNum)
    {
        this.cardNum = cardNum;
    }
    public void setCardType(String cardType)
    {
        this.cardType = cardType;
    }
    public void setCardName(String cardName)
    {
        this.cardName = cardName;
    }
    public void setCardExpiryDate(String cardExpiryDate)
    {
        this.cardExpiryDate = cardExpiryDate;
    }

    public long getCardNum()
    {
        return this.cardNum;
    }
    public String getCardType()
    {
        return this.cardType;
    }
    public String getCardName()
    {
        return this.cardName;
    }
    public String getCardExpiryDate()
    {
        return this.cardExpiryDate;
    }

}
