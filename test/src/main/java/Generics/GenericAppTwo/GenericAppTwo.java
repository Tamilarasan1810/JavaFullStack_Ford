package Generics.GenericAppTwo;
import  java.util.*;
class CustomArrayList<T>
{
    private Object elements[];
    private int size;

    public CustomArrayList(int capacity)
    {
        elements = new Object[capacity];
    }

    public boolean add(List<T> list)
    {
        for(int i=0;i<list.size();i++)
        {
            elements[i] = list.get(i);
        }
        System.out.println("Elements added into customList");
        return true;
    }
    public void printAll()
    {
        for (int i=0;i<elements.length&&elements[i]!=null;i++)
        {
            System.out.println("Element is: "+elements[i]);
        }
    }
}

public class GenericAppTwo {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1,2,3,4,5);

        CustomArrayList<Integer> customList = new CustomArrayList<Integer>(10);
        customList.add(numList);
        customList.printAll();

        CustomArrayList<String> customList2 = new CustomArrayList<String>(10);
        List<String> nameList = Arrays.asList("Hyd","Chennai","Banglore","Bombay");
        customList2.add(nameList);
        customList2.printAll();
    }
}
