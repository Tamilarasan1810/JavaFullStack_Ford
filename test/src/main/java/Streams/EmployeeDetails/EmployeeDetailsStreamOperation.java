package Streams.EmployeeDetails;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private double salary;
    private String dept;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Employee(int id, String name, double salary, String dept) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }
}

public class EmployeeDetailsStreamOperation {
    public static void main(String[] args) {


        Employee e1 = new Employee(101, "tamil", 2500.52, "IT");
        Employee e2 = new Employee(105, "arasan", 6500.52, "ADMIN");
        Employee e3 = new Employee(104, "charan", 1150, "IT");
        Employee e4 = new Employee(102, "varun", 11650.32, "HR");
        Employee e5 = new Employee(106, "tharun", 6443, "IT");
        Employee e6 = new Employee(103, "kiran", 9273, "ADMIN");
        Employee e7 = new Employee(107, "chandru", 5342, "HR");
        Employee e8 = new Employee(108, "hari", 43254.0, "ADMIN");

        List<Employee> empList = Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8);

        // sort by name
        empList.stream().sorted((emp1, emp2) -> emp1.getName().compareTo(emp2.getName())).forEach(emp -> System.out.println(emp));

        // sort by salary

        System.out.println("\nsorting by salary in Ascending order \n");

        empList.stream().sorted((emp1, emp2) -> {
            if (emp1.getSalary() > emp2.getSalary()) {
                return 1;
            } else if (emp1.getSalary() < emp2.getSalary()) {
                return -1;
            }
            return 0;
        }).forEach(emp -> System.out.println(emp));

        // count the no.of employees department wise

        Map<String, Long> departmentWiseEmpCountMap = empList.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));

        System.out.println("\nDepartment wise Employee count: " + departmentWiseEmpCountMap);

        // Department with max number of employees

        Optional<Map.Entry<String, Long>> departmentWithMaxEmployees = departmentWiseEmpCountMap.entrySet().stream().max(Map.Entry.comparingByKey());

        if (departmentWithMaxEmployees.isPresent()) {
            System.out.println("Max no.of Employees in department: " + departmentWithMaxEmployees.get());
        }

        // sum of salary department wise
        Map<String,Double> deptWiseSalariesMap = empList.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.summingDouble(Employee::getSalary)));
        System.out.println("\nDept wise salaries: "+deptWiseSalariesMap);

        // find out max salary department
        Optional<Map.Entry<String, Double>> maxSalaryDept = deptWiseSalariesMap.entrySet().stream().max(Map.Entry.comparingByKey());
        System.out.println("Max Salary dept: "+maxSalaryDept);
        if(maxSalaryDept.isPresent())
        {
            System.out.println("Max Salary dept: "+maxSalaryDept.get());
        }

    }
}
