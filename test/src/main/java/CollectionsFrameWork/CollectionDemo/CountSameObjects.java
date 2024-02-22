package CollectionsFrameWork.CollectionDemo;

import java.util.Arrays;
import java.util.*;
public class CountSameObjects {
    public static void main(String[] args) {
//        List<String> fruitsList =  Arrays.asList(new String[]{"apple","mango","apple","grapes","banana"});

        ArrayList<String> fruitsList = new ArrayList<String>();
        fruitsList.add("apple");
        fruitsList.add("mango");
        fruitsList.add("apple");
        fruitsList.add("grapes");
        fruitsList.add("banana");

        System.out.println(fruitsList);
        System.out.println("No. of fruits: "+fruitsList.size());

        // checks fruit present in list or not
        if(fruitsList.contains("mango"))
        {
            System.out.println("Yes, mango is present");
        }
        else {
            System.out.println("No, Mango is not present");
        }

        // replace a fruit in list
        if(fruitsList.contains("grapes"))
        {
            int index = fruitsList.indexOf("grapes");
            fruitsList.set(index,"watermelon");
        }
        System.out.println(fruitsList);

        // delete an element
        fruitsList.remove("mango");
        System.out.println(fruitsList);

        ArrayList<String> fruitList2 = new ArrayList<>(fruitsList);
        System.out.println("2nd list: "+fruitList2);

        fruitList2.remove(1);
        fruitList2.remove(2);
        System.out.println("2d list: "+fruitList2);

        //removeall from fruitList
        fruitsList.removeAll(fruitList2);
        System.out.println("1st list: "+fruitsList);

        // clear fruit list
        fruitsList.clear();
        System.out.println("fruitList is: "+fruitsList);
    }
}
