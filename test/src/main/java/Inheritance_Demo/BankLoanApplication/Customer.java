package Inheritance_Demo.BankLoanApplication;

public class Customer {
    private static long genId=23490;
    private  long id;
    private String name;
    private long phone;


    public Customer( String name, long phone) {
     /*   Random rand = new Random();
        long randId = rand.nextLong(99999999)+1111;
        this.id = randId;*/

        genId++;
        this.id= genId;
        this.name = name;
        this.phone = phone;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
    public long getid() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public long getPhone() {
        return this.phone;
    }
    public void customerInfo()
    {
        System.out.println("Customer Name: "+this.getName()+" id: "+this.getid()+" Phone: "+this.getPhone());
    }

}
