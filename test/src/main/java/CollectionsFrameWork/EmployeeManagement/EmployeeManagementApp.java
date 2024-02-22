package CollectionsFrameWork.EmployeeManagement;

import java.util.*;

class Company {
    private int CompanyRegNo;
    private String CompanyName;
    private ArrayList<Employee> employList = new ArrayList<Employee>();

    public Company(int companyRegNo, String companyName) {
        CompanyRegNo = companyRegNo;
        CompanyName = companyName;

    }

    public long getCompanyRegNo() {
        return CompanyRegNo;
    }

    public void setCompanyRegNo(int companyRegNo) {
        CompanyRegNo = companyRegNo;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public ArrayList<Employee> getEmployList() {
        return employList;
    }

//    public void setEmployList(String[] employList) {
//        this.employList = employList;
//    }

    public void addEmployee(Employee emp)
    {
        this.employList.add(emp);
    }
    public void workingEmployees()
    {
        for(Employee emp:employList)
        {
            System.out.println(emp.getEmployeeName());
        }
    }

    public void updateEmployeeProject(int empId,String newProject)
    {
        boolean flag=false;
        for(int i=0;i<employList.size();i++)
        {
            Employee emp = employList.get(i);

            if(emp.getEmployeeId() == empId)
            {
                HashSet<String> empProjectSet = emp.getProjects();
                empProjectSet.add(newProject);
                System.out.println("Project details updated for emp: "+empId);
                flag= true;
                break;
            }
        }
        if(!flag) {
            System.out.println("Porject details not updated");
        }

    }

    public void displayEmployeeSameProjectList(String projectName)
    {
        for(Employee emp: employList)
        {
            if(emp.getProjects().contains(projectName))
            {
                System.out.println(emp.getEmployeeId()+" "+emp.getEmployeeName()+" "+emp.getProjects());
            }
        }
    }

    public void displayEmployeeListInDescOrderBySalary(){

    }
    // business operations:
    // add employ, update emp project details,
    // display emp working in same project,
    // display emp details in descending order based on salary

}

class Employee{
    private int EmployeeId;
    private String employeeName;
    private double employeeSalary;

    public HashSet<String> getProjects() {
        return projects;
    }

    private HashSet<String> projects;

    public void setProjects(HashSet<String> projects) {
        this.projects = projects;
    }

    private int experience;

    public Employee(int employeeId, String employeeName, double employeeSalary,  int experience) {
        EmployeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.projects = new HashSet<String>();
        this.experience = experience;

    }


    public int  getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(int  employeeId) {
        EmployeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
    // business operations:
    // add employ, update emp project details,
    // display emp working in same project,
    // display emp details in descending order based on salary


}

public class EmployeeManagementApp {
    public static void main(String[] args) {
        Company company =  new Company(84723924,"Ford");

        Employee emp1 = new Employee(1001,"Tamil",42343,3);
        Employee emp2 = new Employee(1002,"Siva",34233,4);
        Employee emp3 = new Employee(1003,"Selvan",75643,7);
        Employee emp4 = new Employee(1004,"Joe",53432,3);
        Employee emp5 = new Employee(1005,"Meg",77542,4);
        company.addEmployee(emp1);
        company.addEmployee(emp2);
        company.addEmployee(emp3);
        company.addEmployee(emp4);
        company.addEmployee(emp5);
        company.updateEmployeeProject(1001,"dbms");
        company.updateEmployeeProject(1001,"erp");
        company.updateEmployeeProject(1002,"dbms");
        company.updateEmployeeProject(1003,"test");
        company.updateEmployeeProject(1004,"hms");
        company.updateEmployeeProject(1005,"erp");
        company.updateEmployeeProject(1004,"dbms");
        company.updateEmployeeProject(1002,"hms");
        company.updateEmployeeProject(1003,"dbms");
        company.displayEmployeeSameProjectList("dbms");

        ArrayList<Employee> empList = company.getEmployList();
        System.out.println("\nEmployee Details: \n");
        for(Employee emp: empList)
        {
            System.out.println(emp.getEmployeeId()+" "+emp.getEmployeeName()+" "+emp.getEmployeeSalary()+" "+emp.getProjects());
        }

    }
}
