package org.example.strings;

public class RemoveFirstTwoChars {
    public static String removeFirstTwoCharsCharAt(String string){
        if(string.length() <= 2) return "";
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=2; i<string.length(); i++){
            stringBuilder.append(string.charAt(i));
        }
        return stringBuilder.toString();
    }
    public static String removeFirstTwoCharsStringBuilder(String string){
        if(string.length() <= 2) return "";
        return new StringBuilder(string).deleteCharAt(0).deleteCharAt(0).toString();
    }
}
