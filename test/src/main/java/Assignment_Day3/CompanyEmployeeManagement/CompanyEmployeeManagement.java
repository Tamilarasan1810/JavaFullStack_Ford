package Assignment_Day3.CompanyEmployeeManagement;

class Employee{
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public void increseSalary(double amount)
    {
        if(amount>this.salary)
        {
            this.salary = amount;
            System.out.println("Salary Increased Successfully to: "+this.salary);
        }
        else {
            System.out.println("Your given salary is lower than his current salary: "+this.salary);
        }
    }
}

public class CompanyEmployeeManagement {
    public static void main(String[] args) {
        Employee emp = new Employee(101,"Tamil",45000);
        emp.increseSalary(50000);
        emp.increseSalary(35000);

    }
}
