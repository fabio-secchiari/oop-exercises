package org.example.functional;

import java.util.List;
import java.util.Objects;

public class AllPalindrome {
    public static boolean allPalindrome(List<String> strings){
        return strings.stream().allMatch(s -> Objects.equals(s, new StringBuilder(s).reverse().toString()));
    }
}
