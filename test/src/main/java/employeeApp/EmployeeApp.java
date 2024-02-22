package employeeApp;

import employeeApp.*;

import java.util.*;

// Constructor Overloading
class Employee {
    private int empId;
    private String empName;
    private double empSalary;
    private String empDesign;

    private String projects[];
    private static String company = "FORD";

    public Employee() {
    }

    public Employee(int empId, String empName, double empSalary, String empDesign, String[] projects) {
//        this.empId = empId;
//        this.empName = empName;
//        this.empSalary = empSalary;
        this(empId, empName, empSalary);
        this.empDesign = empDesign;
        this.projects = projects;
    }

    public Employee(int empId, String empName) {
//        this();
        this.empId = empId;
        this.empName = empName;
    }

    public Employee(int empId, String empName, double empSalary) {
//        this.empId = empId;
//        this.empName = empName;
        this(empId, empName);
        this.empSalary = empSalary;
    }

    public Employee(int empId, String empName, String empDesign, String[] projects) {
//        this.empId = empId;
//        this.empName = empName;
        this(empId, empName);
        this.empDesign = empDesign;
        this.projects = projects;
    }

    public double getSalary() {
        return this.empSalary;
    }

    public String getName() {
        return this.empName;
    }

    public void displayEmployeeInfo() {
        System.out.println("EmpId: " + this.empId + "\nEmpName: " + this.empName + "\nEmpSalary: " + this.empSalary + "\nEmpDesign: " + this.empDesign + "\nProjects: " + Arrays.toString(this.projects) + "\nCompany: " + this.company + "\n\n");
    }

}

public class EmployeeApp {
    public static void main(String[] args) {
        String projects[] = {"DMS", "HMS", "DBMS"};
        Employee emp1 = new Employee(103, "Tamilarasan", 139465, "Developer", projects);
        Employee emp2 = new Employee(104, "Siva", 402847);
        Employee emp3 = new Employee(105, "Sudhan", 160382);
        Employee emp4 = new Employee(103, "Akash", 60023, "Developer", projects);
        Employee emp5 = new Employee(103, "Lithun", 130594, "Developer", projects);
        Employee[] employees = {emp1, emp2, emp3, emp4, emp5};
        EmployeeGradeFinder grade1 = new EmployeeGradeFinder();

//       emp1.displayEmployeeInfo();
//       emp2.displayEmployeeInfo();
//       emp3.displayEmployeeInfo();
//       emp4.displayEmployeeInfo();
//       emp5.displayEmployeeInfo();
        String[] employeesGrade = grade1.findEmpGrades(employees);
        for (int i = 0; i < employeesGrade.length; i++) {
            System.out.println(employees[i].getName() + "'s SalaryGrade is: " + employeesGrade[i]);
        }
    }
}
