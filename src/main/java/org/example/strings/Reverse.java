package org.example.strings;

public class Reverse {
    public static String reverseCharAt(String string){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=string.length()-1; i>=0; i--){
            stringBuilder.append(string.charAt(i));
        }
        return stringBuilder.toString();
    }

    public static String reverseStringBuilder(String string){
        return new StringBuilder(string).reverse().toString();
    }
}
