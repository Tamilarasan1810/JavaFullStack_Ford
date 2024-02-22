package CollectionsFrameWork.HashMaps.StudentCourseDetails;

import java.util.HashMap;
import java.util.Objects;
import java.util.*;

class Student{
    private int id;
    private String name;
    private String email;

    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name) && Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email);
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

class Course{
    private int id;
    private String name;
    private double price;
    private String duration;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return id == course.id && Double.compare(price, course.price) == 0 && Objects.equals(name, course.name) && Objects.equals(duration, course.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, duration);
    }

    public Course(int id, String name, double price, String duration) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.duration = duration;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}

public class StudentCourseDetails {
    public HashMap<Student,Course> studentCourses = new HashMap<>();

    public void addStudentCourse(Student student,Course course)
    {
        studentCourses.put(student,course);
    }
    public void updateStudentCourse(Student student, Course course)
    {
        studentCourses.put(student,course);
        System.out.println(student.getName()+"'s course is updated successfully!");
    }
    public void deleteStudentCourse(Student student,Course course)
    {
        studentCourses.remove(student,course);
        System.out.println(student.getName()+"'s course "+course.getName()+" is removed successfully!");
    }
    public void deleteStudentCourseEntry(Student student)
    {
        studentCourses.remove(student);
        System.out.println("all "+student.getName()+"'s entries were deleted!");
    }
    public void displayStudent(Course course)
    {
        String name;
        Set<Map.Entry<Student,Course>> sets = studentCourses.entrySet();
        System.out.println("Students who selected "+course.getName()+" are: ");
        for(Map.Entry<Student,Course> set: sets)
        {
           name =  set.getValue().getName();
           if(name.equals(course.getName()))
           {
               System.out.println(set.getKey().getName());
           }
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student(2334,"Tamil","test@gmail.com");
        Student student2 = new Student(4532,"Meg","meg@gmail.com");
        Student student3 = new Student(6656,"Peter","peter@gmail.com");

        Course course1 = new Course(334,"JFS",3434,"68Hr");
        Course course2 = new Course(564,"DBMS",654,"72Hr");
        Course course3 = new Course(543,"FS",676,"120Hr");

        StudentCourseDetails obj = new StudentCourseDetails();
        obj.addStudentCourse(student1,course1);
        obj.addStudentCourse(student2,course2);
        obj.addStudentCourse(student3,course3);
        obj.addStudentCourse(student1,course2);
        obj.addStudentCourse(student3,course2);
        obj.addStudentCourse(student3,course1);
        obj.addStudentCourse(student1,course3);

        obj.updateStudentCourse(student2,course3);
        obj.deleteStudentCourse(student3,course1);
        obj.deleteStudentCourseEntry(student3);

        obj.displayStudent(course3);
    }
}
