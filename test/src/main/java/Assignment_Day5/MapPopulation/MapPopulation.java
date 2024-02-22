package Assignment_Day5.MapPopulation;

import java.util.HashMap;
import java.util.Scanner;
import java.util.*;
public class MapPopulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int x, temp;
        String name;
        while (true) {
            System.out.println("1. Add Student\n2.Remove Student\n3.Display\n4.exit");
            System.out.print("Enter Your choice: ");
            x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.print("Enter the Student name: ");
                    sc.next();
                    name = sc.nextLine();
                    System.out.print("Enter " + x + "'s Score: ");
                    x = sc.nextInt();
                    map.put(name, x);
                    System.out.println("Student map created successfully");
                    break;
                case 2:
                    System.out.print("Enter the Student to remove: ");
                    name = sc.nextLine();
                    map.remove(name);
                    System.out.println("Student Removed successfully ");
                    break;
                case 3:
                    System.out.println("Students and their Scores: ");
                    for(Map.Entry entry : map.entrySet())
                    {
                        System.out.println(entry.getKey()+" : "+entry.getValue());
                    }
                    break;
                case 4:
                    System.exit(0);
            }

        }
    }
}
