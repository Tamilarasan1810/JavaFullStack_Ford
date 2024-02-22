package employeeApp;
import employeeApp.*;
public class EmployeeGradeFinder {
    public String[] findEmpGrades(Employee[] employees)
    {
        int len = employees.length;
        String[] grade = new String[len];
        int i=0;
        for(Employee emp:employees)
        {
            if(emp.getSalary()>50000&&emp.getSalary()<100000)
            {
                grade[i++]= "A";
            }
            else if(emp.getSalary()>100000&&emp.getSalary()<150000)
            {
                grade[i++]= "B";
            }
            else if(emp.getSalary()>150000&&emp.getSalary()<200000)
            {
                grade[i++]= "C";
            }
            else if(emp.getSalary()>200000)
            {
                grade[i++]= "D";
            }

        }
        return grade;
    }

}
