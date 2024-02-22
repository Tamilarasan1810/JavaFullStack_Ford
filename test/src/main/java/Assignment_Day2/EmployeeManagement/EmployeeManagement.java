package Assignment_Day2.EmployeeManagement;

abstract class Employee {
    String name;
    double monthlySalary;
    public Employee(String name,double salary)
    {
        this.name = name;
        this.monthlySalary = salary;
    }


    abstract double calculateAnnualSalary();
}
class Developer extends Employee{

    public Developer(String name,double salary)
    {
        super(name,salary);
    }
    public double calculateAnnualSalary()
    {
        return (this.monthlySalary*12);
    }
}
class Manager extends Employee{
    public Manager(String name,double salary)
    {
        super(name,salary);
    }
    public double calculateAnnualSalary() {
        return (this.monthlySalary*12);
    }
}
public class EmployeeManagement {
    public static void main(String[] args) {
        Developer dev = new Developer("Tamil",45000);
        System.out.println("Developer annual salary: "+ dev.calculateAnnualSalary());
        Manager mag = new Manager("Steve",93325);
        System.out.println("Manager annual salary: "+mag.calculateAnnualSalary());
    }
}
