package org.example.Strings;

public class CompressRepeatedCharacters {
    public static void main(String[] args) {
        String str = "aaabbbcccaaa";
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i = 0; i < str.length() - 1; i++){
            if(str.charAt(i) != str.charAt(i + 1)){
                sb.append(str.charAt(i)).append(count);
                count = 1;
            }
            else
                count++;
        }

        sb.append(str.charAt(str.length() - 1)).append(count);

        System.out.println(sb.toString());
    }
}

// a a a b b b c c c a a a
// 0 1 2 3 4 5 6 7 8 9 10 11
