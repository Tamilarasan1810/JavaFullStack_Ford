package Streams.StreamDemo;
import  java.util.*;
import java.util.stream.*;

public class StreamAppOne {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        //count of odd numbers
        IntStream stream = Arrays.stream(arr);
        IntStream filteredStream = stream.filter(e->e%2==1);
        long oddCount = filteredStream.count();
        System.out.println("No.of odd elements: "+oddCount);

        long evenCount = Arrays.stream(arr).filter(e -> e%2==0).count();
        System.out.println("No.of even elements: "+evenCount);

        // find the sum of numbers which are divisible by 5 add 12 to each number
        List<Integer> numList =Arrays.asList(10,21,30,41,50,61,70,81,90,101);
        List<Integer> newNumList = numList.stream().filter(e->e%5==0).map(e->e+12).collect(Collectors.toList());
        System.out.println(newNumList);

        Optional<Integer> sum = numList.stream().filter(e->e%5==0).map(e->e+12).reduce((e1, e2)->e1+e2);
        System.out.println("sum: "+sum.get());

        Optional<Integer> optionalSum = numList.stream().filter(e->e%5==0).reduce((e1,e2)->e1+e2);
        System.out.println("sum of num divisible by 5 are: "+optionalSum.get());


        List<String> cityList = Arrays.asList("Chennai","Madurai","Kolkatta","Banglore","Vizag");
        cityList.forEach(city -> System.out.println("City is: "+city));

    }
}
