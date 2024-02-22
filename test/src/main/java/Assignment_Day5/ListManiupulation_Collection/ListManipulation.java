package Assignment_Day5.ListManiupulation_Collection;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ListManipulation {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int x,ele,temp;
        while(true)
        {
            System.out.println("1. Add\n2.Remove\n3.Find element\n4.Display\n5.exit");
            System.out.print("Enter Your choice: ");
            x=sc.nextInt();
            switch (x)
            {
                case 1:
                    System.out.print("Enter the number: ");
                    ele = sc.nextInt();
                    list.add(new Integer(ele));
                    System.out.println("Element added successfully");
                    break;
                case 2:
                    System.out.print("Enter the element to remove: ");
                    ele = sc.nextInt();
                    list.remove(Integer.valueOf(ele));
                    System.out.println("Element Removed successfully ");
                    break;
                case 3:
                    System.out.print("Enter the element to find: ");
                    ele = sc.nextInt();
                    temp = list.indexOf(Integer.valueOf(ele));
                    System.out.println("The element "+ele+" found at index: "+temp);
                    break;
                case 4:
                    System.out.println("Array elements are: "+ Arrays.toString(list.toArray()));
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
