package org.example.strings;

public class Concatenate {
    public static String concatenate(String[] strings){
        StringBuilder stringBuilder = new StringBuilder();
        for(String word: strings){
            stringBuilder.append(word);
        }
        return stringBuilder.toString();
    }
}
