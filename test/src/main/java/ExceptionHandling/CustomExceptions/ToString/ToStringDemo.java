package ExceptionHandling.CustomExceptions.ToString;

class Employ{
    private String name;
    public Employ(String name)
    {
        this.name = name;
    }
    public String toString()
    {
        return "Employee Name: "+this.name;
    }
}
public class ToStringDemo {
    public static void main(String[] args) {
        Employ emp = new Employ("Tamilarasan");
        System.out.println(emp);
    }
}
