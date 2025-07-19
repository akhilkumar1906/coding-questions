package org.example.Java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LazyEvaluation {
    public static void main(String[] args) {
        Stream.of("A", "B", "C", "D", "E")
//                .filter(s -> {
//                    System.out.println("Filtering " + s);
//                    return  s.equals("B");
//                })
                .filter(s -> s.equals("C"))
                .findFirst()
                .ifPresent(System.out::println);
    }
}
