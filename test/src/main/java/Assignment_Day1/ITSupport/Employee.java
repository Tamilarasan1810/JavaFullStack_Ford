package Assignment_Day1.ITSupport;

import java.util.Scanner;

public class Employee{
    private String firstName;
    private String lastName;
    private String department;
    private static String company = "FORD";

    public Employee()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter FirstName: ");
        String firstName = sc.nextLine();
        System.out.println("Enter LastName: ");
        String lastName = sc.nextLine();
        System.out.println("1. Technical\n2. Admin\n3. Human Resource\n4. Legal\nSelect Department: ");
        int x = sc.nextInt();
        String department="";
        switch (x)
        {
            case 1:
                department="Tech";
                break;
            case 2:
                department="Admin";
                break;
            case 3:
                department="HR";
                break;
            case 4:
                department="Legal";
                break;
        }
        this.firstName=firstName;
        this.lastName=lastName;
        this.department=department;
    }
    public String getFirstName()
    {
        return this.firstName;
    }
    public String getLastName()
    {
        return  this.lastName;
    }
    public String getDepartment(){
        return this.department;
    }
    public String getCompany()
    {
        return this.company;
    }
}
