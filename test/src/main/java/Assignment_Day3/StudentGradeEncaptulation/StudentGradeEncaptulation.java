package Assignment_Day3.StudentGradeEncaptulation;

import java.util.Arrays;

class Student{
    private int id;
    private String name;
    private int[] grades;

    public Student(int id, String name, int[] grades) {
        this.id = id;
        this.name = name;
        this.grades = grades;
    }
    public void calculateGrade()
    {
        int sum = Arrays.stream(grades).sum();
        System.out.println("Total Greades are: "+sum);
    }
}

public class StudentGradeEncaptulation {
    public static void main(String[] args) {
        int[]marks ={78,45,65};
        Student student1 = new Student(101,"Tamil",marks);
        student1.calculateGrade();
    }
}
