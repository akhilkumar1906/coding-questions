package org.example.Java8.Comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListWithNulls {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Mango", null, "Apple", null, "Banana");
        list1.sort(Comparator.nullsFirst(Comparator.reverseOrder()));
        list1.forEach(s -> System.out.print(s + " "));

        System.out.println();

        List<String> list2 = Arrays.asList("Mango", null, "Apple", null, "Banana");
        list2.sort(Comparator.nullsLast(Comparator.naturalOrder()));
        list2.forEach(s -> System.out.print(s + " "));


    }
}
