package Streams.CountOperation;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

// program to take a list of animal names and count them
public class CountOperation {
    public static void main(String[] args) {
        List<String> animals = Arrays.asList("cow", "cat", "Cow", "dog", "hen", "Dog", "Cat");

        animals.stream().sorted().forEach(animal -> System.out.print(animal + " "));

        System.out.println("\nIn reverse order\n");

        animals.stream().sorted((a1, a2) -> a2.compareTo((a1))).forEach(animal -> System.out.print(animal + " "));

        //count the animals

        Map<String, Long> animalCountMap = animals.stream().map(animal -> animal.toLowerCase()).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("animal count: \n"+ animalCountMap);

    }

}
