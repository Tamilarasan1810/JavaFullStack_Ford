package CollectionsFrameWork.ComparatorPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Customer implements Comparable<Customer> {
    private int id;
    private String name;

    private int age;

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Customer(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int compareTo(Customer customer) {
        if (this.id == customer.id) {
            return 0;
        } else if (this.id > customer.id) {
            return 1;
        }
        return -1;
    }
}


class CustomerNamedComparator implements Comparator<Customer> {

    public int compare(Customer customer1, Customer customer2) {
        return customer2.getName().compareTo(customer1.getName());
    }
}

class CustomerAgeComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer customer1, Customer customer2) {
        if (customer1.getAge() == customer2.getAge()) {
            return 0;
        } else if (customer1.getAge() > customer2.getAge()) {
            return 1;
        }
        return -1;
    }
}

public class CustomerDemo {
    public static void main(String[] args) {
        Customer cust1 = new Customer(1, "test", 32);
        Customer cust2 = new Customer(2, "zkasd;", 13);
        Customer cust3 = new Customer(3, "fasdf", 56);
        Customer cust4 = new Customer(4, "arta", 23);

        ArrayList<Customer> customerList = new ArrayList<Customer>();
        customerList.add(cust1);
        customerList.add(cust2);
        customerList.add(cust3);
        customerList.add(cust4);
        System.out.println(customerList);
        System.out.println("natural sort");
        Collections.sort(customerList);
        System.out.println(customerList);
        System.out.println("sort by name in desc order");
        Collections.sort(customerList,new CustomerNamedComparator());
        System.out.println(customerList);
        System.out.println("sort by age ");
        Collections.sort(customerList,new CustomerAgeComparator());
        System.out.println(customerList);

    }
}
