package Assignment_Day1.Sorting;

import java.util.*;

class SortName {
    private String[] names;

    public SortName(String[] names) {
        Arrays.sort(names);
        this.names = names;
        displayNames();
    }

    public void displayNames() {
        System.out.println("Sorted Names order: " + Arrays.toString(this.names));
    }
}
public class SortingApp {
    public static void main(String[] args) {
        String[] names = {"Tamil", "King", "Vishnu", "Peter", "Meg", "Chris", "Lois", "Quagmire", "Joe", "Cleveland"};
        SortName nameObject = new SortName(names);
    }
}
