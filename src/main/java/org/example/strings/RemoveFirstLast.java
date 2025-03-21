package org.example.strings;

public class RemoveFirstLast {
    public static String removeFirstLast(String s){
        if(s.length() < 2) return s;
        if(s.charAt(0) == s.charAt(s.length()-1))
            return new StringBuilder(s).deleteCharAt(s.length()-1).deleteCharAt(0).toString();
        return s;
    }
}
