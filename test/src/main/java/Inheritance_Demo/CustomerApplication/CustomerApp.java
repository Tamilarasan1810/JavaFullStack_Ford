package Inheritance_Demo.CustomerApplication;

//premium,gold,normalCustomer.
class Customer {
    private static long genId=23490;
    private  long id;
    private String name;
    private String membership;
    private long phone;

    public Customer( String name, String membership, long phone) {
     /*   Random rand = new Random();
        long randId = rand.nextLong(99999999)+1111;
        this.id = randId;*/

        genId++;
        this.id= genId;
        this.name = name;
        this.membership = membership;
        this.phone = phone;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setMembership(String membership) {
        this.membership = membership;
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

    public String getMembership() {
        return this.membership;
    }

    public long getPhone() {
        return this.phone;
    }
    public void customerInfo()
    {
        System.out.println("Customer Name: "+this.getName()+" id: "+this.getid()+" MemberShip: "+this.getMembership()+" Phone: "+this.getPhone());
    }

}

class CallCenter {
    private static void pickUpCall() {
        System.out.println("Started Serving Customer");
    }

    private static void allotTime(int time) {
        System.out.println("Alloted time " + time + " min for Customer");
    }

    private static void hangCall() {
        System.out.println("Service over to Customer");
    }

    public static void handleCustomer(Customer customer) {
        pickUpCall();
        if(customer.getMembership().equals("Premium"))
        {
            allotTime(15);
        }
        else if(customer.getMembership().equals("Golden"))
        {
            allotTime(10);
        }
        else{
            allotTime(5);
        }
    }
}

public class CustomerApp {
    public static void main(String[] args) {
        Customer customer1  = new Customer("Siva","Premium",43283949);
        Customer customer2  = new Customer("Tamil","Golden",73646389);
        Customer customer3  = new Customer("Joe","Standard",74623293);
        customer1.customerInfo();
        customer2.customerInfo();
        customer3.customerInfo();
        CallCenter.handleCustomer(customer1);
        CallCenter.handleCustomer(customer2);
        CallCenter.handleCustomer(customer3);
    }
}
