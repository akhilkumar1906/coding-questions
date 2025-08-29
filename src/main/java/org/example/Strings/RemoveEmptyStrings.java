package org.example.Strings;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class RemoveEmptyStrings {
    public static <List> void main(String[] args) {
        String[] arr = {"Hello"," ", "", "World", null, "Java", "", " ", "Streams", null};
        Arrays.stream(arr)
                .filter(s -> s != null && !s.equals(""))
                .forEach(s -> System.out.print(s + " "));

        Arrays.stream(arr)
                .filter(s -> s != null && !s.equals(""))
                .collect(Collectors.toList());

        System.out.println();

        Arrays.stream(arr)
                .filter(Objects::nonNull)
                .filter(s -> !s.isBlank())
                .forEach(s -> System.out.print(s + " "));
    }
}
