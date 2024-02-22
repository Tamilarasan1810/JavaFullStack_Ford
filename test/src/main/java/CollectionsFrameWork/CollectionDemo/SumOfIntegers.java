package CollectionsFrameWork.CollectionDemo;

import java.util.ArrayList;

public class SumOfIntegers {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<Integer>();

        numList.add(12);
        numList.add(22);
        numList.add(42);
        numList.add(4);
        numList.add(12);

        System.out.println(numList);

        int sum = 0;

        for(Integer ele:numList)
        {
            sum+=ele;
        }
        System.out.println("Sum is: "+sum);

        numList.remove(new Integer(12));
        System.out.println(numList);



    }
}
