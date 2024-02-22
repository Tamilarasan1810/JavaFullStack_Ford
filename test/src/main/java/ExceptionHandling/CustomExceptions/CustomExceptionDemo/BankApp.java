package ExceptionHandling.CustomExceptions.CustomExceptionDemo;

class BankAccount{
    private long accountNumber;
    private String name;
    private double amount;
    private String accountType;
    public BankAccount(String name,String accountType,double amount)
    {
        this.accountNumber = (long) Math.abs(Math.random()*32232);
        this.name = name;
        this.amount = amount;
        this.accountType = accountType;
    }
    public String toString()
    {
        return "AccountNumber: "+this.accountNumber+"\nAccount Holder Name: "+this.name+"\nAccount Type: "+this.accountType+"\nBalance: "+this.amount+"\n";
    }
}
class ABCBank{
    public BankAccount openAccount(Person person,String accounttype,double amount){
        if(person.getAge()>=18)
        {
            return new BankAccount(person.getName(),accounttype,amount);
        }
        else{
            throw new InvalidPersonDetails("Person age is not eligible to open an account");
        }

    }

}
class InvalidPersonDetails extends RuntimeException{
    private String message;
    public InvalidPersonDetails(String message)
    {
        this.message = message;
    }
    public String toString()
    {
        return this.message;
    }
}
class Person
{
    private long adhaar;
    private String name;
    private int age;
    public Person(long adhaar, String name,int age)
    {
        this.adhaar = adhaar;
        this.name = name;
        this.age=  age;
    }
    public int getAge()
    {
        return this.age;
    }
    public String getName()
    {
        return this.name;
    }
}
public class BankApp {
    public static void main(String[] args) {
        Person person1 = new Person(3234235,"tamil",20);
        Person person2 = new Person(54434,"siva",54);
        ABCBank bank = new ABCBank();
        try {
            BankAccount account1 = bank.openAccount(person1, "Savings", 5000);
            BankAccount account2 = bank.openAccount(person2,"Savings",10000);
            System.out.println(account1);
            System.out.println(account2);
        }
        catch (InvalidPersonDetails exe)
        {
            System.out.println(exe);
        }

    }
}
