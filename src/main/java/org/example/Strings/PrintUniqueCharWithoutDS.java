package org.example.Strings;

import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class PrintUniqueCharWithoutDS {
    public static void main(String[] args) {
        String str = "programming";

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(result.indexOf(String.valueOf(ch)) == -1){
                result.append(ch);
            }
        }

        String unique = str.chars()
                            .mapToObj(c -> String.valueOf((char) c))
                            .collect(Collectors.toCollection(LinkedHashSet::new))
                            .stream().collect(Collectors.joining());



        System.out.println(result.toString());
    }
}
