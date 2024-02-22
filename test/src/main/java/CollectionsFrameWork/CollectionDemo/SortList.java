package CollectionsFrameWork.CollectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortList {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(23);
        numList.add(5);
        numList.add(34);
        numList.add(54);
        System.out.println("unsorted list: "+numList);

        Integer[] numArr = new Integer[numList.size()];
        numList.toArray(numArr);

        System.out.println("Sorted array: "+Arrays.toString(numArr));

        Collections.sort(numList);
        System.out.println("Sorted list: "+numList);


    }
}
