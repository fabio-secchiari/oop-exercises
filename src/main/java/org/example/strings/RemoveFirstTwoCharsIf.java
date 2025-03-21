package org.example.strings;

public class RemoveFirstTwoCharsIf {

    public static String removeFirstTwoCharsIfCharAt(String string){
        if(string.isEmpty()) return "";
        StringBuilder stringBuilder = new StringBuilder();
        if(string.charAt(0) == 'H') stringBuilder.append('H');
        if(string.length() > 1 && string.charAt(1) == 'e') stringBuilder.append('e');
        for(int i=2; i<string.length(); i++){
            stringBuilder.append(string.charAt(i));
        }
        return stringBuilder.toString();
    }

    public static String removeFirstTwoCharsIfStringBuilder(String string){
        if(string.isEmpty()) return "";
        StringBuilder stringBuilder = new StringBuilder(string);
        if(stringBuilder.charAt(0) != 'H') {
            stringBuilder.deleteCharAt(0);
            if(string.length() > 1 && stringBuilder.charAt(0) != 'e'){
                stringBuilder.deleteCharAt(0);
            }
        } else if (string.length() > 1 && stringBuilder.charAt(1) != 'e') {
                stringBuilder.deleteCharAt(1);
        }
        return stringBuilder.toString();
    }
}
