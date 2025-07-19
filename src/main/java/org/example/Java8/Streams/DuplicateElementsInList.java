package org.example.Java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElementsInList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 2, 6, 3, 7, 8, 8);

       Map<Integer, Long> map =  list.stream()
               .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

       map.entrySet().stream()
               .filter(e -> e.getValue() > 1)
               .map(e -> e.getKey())
               .forEach(System.out::println);
    }
}
