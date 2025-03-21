package org.example.strings;

public class GoodAtTheBeginning {
    public static boolean goodAtTheBeginning(String s){
        StringBuilder stringBuilder = new StringBuilder(s);
        return s.length() >= 4 && stringBuilder.substring(0, 4).equals("good");
    }
}
