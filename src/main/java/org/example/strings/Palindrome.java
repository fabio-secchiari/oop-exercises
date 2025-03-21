package org.example.strings;

public class Palindrome {
    public static boolean isPalindrome(String s){
        return s.toLowerCase().contentEquals(new StringBuilder(s).reverse().toString().toLowerCase());
    }
}
