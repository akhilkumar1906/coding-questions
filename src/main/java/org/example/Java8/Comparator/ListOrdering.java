package org.example.Java8.Comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListOrdering {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Mango", "Banana", "Apple");
        list.sort(Comparator.naturalOrder());
        list.forEach(System.out::print);

        System.out.println();

        List<String> list2 = Arrays.asList("Mango", "Banana", "Apple");
        list2.sort(Comparator.reverseOrder());
        list2.forEach(System.out::print);
    }
}
