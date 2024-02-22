package Assignment_Day5.CommonElements;

import java.util.*;

public class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        ArrayList<String> list1 = new ArrayList<String>();
//        ArrayList<String> list2 = new ArrayList<String>();
        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new HashSet<String>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Mango");

        set2.add("Apple");
        set2.add("Orange");
        set2.add("Mango");

        Set<String> set3 = new HashSet<String>();
        for(String obj :set1)
        {
            if(set2.contains(obj))
            {
                set3.add(obj);
            }
        }
        System.out.println("The common Elements are: "+ Arrays.toString(set3.toArray()));
    }
}
