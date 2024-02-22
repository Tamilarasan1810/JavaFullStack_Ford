package Assignment_Day6.EmployeeDatabase;

import java.util.TreeMap;

class Employee{
    private int id;
    private String name;
    private String position;

    public Employee(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}

public class EmployeeDatabase {
    private TreeMap<Integer,Employee> treeMap = new TreeMap<Integer,Employee>();

    public void addEmployee(Employee emp)
    {
        this.treeMap.put(emp.getId(),emp);
        System.out.println("Employee added Successfully");
    }

    public void updateEmployee(int id,Employee emp)
    {
        this.treeMap.put(id,emp);
        System.out.println("Employee updated Successfully");
    }
    public void removeEmployee(int id)
    {
        this.treeMap.remove(id);
        System.out.println("Employee removed Successfully");
    }
    public void displayEmployees()
    {
        System.out.println(this.treeMap);
    }

    public static void main(String[] args) {
        EmployeeDatabase employeeDatabase = new EmployeeDatabase();
        Employee emp1 = new Employee(101,"tamil","developer");
        Employee emp2 = new Employee(102,"arasan","tester");
        Employee emp3 = new Employee(102,"test","test");
        employeeDatabase.addEmployee(emp1);
        employeeDatabase.addEmployee(emp2);

        employeeDatabase.displayEmployees();

        employeeDatabase.updateEmployee(102,emp3);
        employeeDatabase.displayEmployees();

        employeeDatabase.removeEmployee(102);
        employeeDatabase.displayEmployees();
    }
}
