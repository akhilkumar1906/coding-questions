package org.example.Java8.Streams;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordOccurences {
    public static void main(String[] args) {
        String text = "apple banana apple orange banana apple";
        String[] strArr = text.split(" ");
        Map<String, Long> result = Arrays.stream(strArr)
                                            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);
    }
}
