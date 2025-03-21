package org.example.strings;

public class GoodAroundTheBeginning {
    public static boolean goodAroundTheBeginning(String s){
        StringBuilder stringBuilder = new StringBuilder(s);
        if(stringBuilder.charAt(0) != 'g'){
            return s.length() >= 4 && stringBuilder.substring(1, 5).equals("good");
        } else {
            return s.length() >= 4 && stringBuilder.substring(0, 4).equals("good");
        }
    }
}
