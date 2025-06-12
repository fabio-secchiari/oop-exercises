package org.example.exceptions;

import java.text.ParseException;

public class CheckString {
    public static void checkString(String s) throws ParseException {
        if(s.length() % 2 != 0 || s.isEmpty()) throw new ParseException("Odd string found", 0);
        boolean curIsDigit = Character.isDigit(s.charAt(0));
        if(curIsDigit) throw new ParseException("First char should be letter: " + s.charAt(0), 0);
        for(int i=1; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i)) == curIsDigit){
                throw new ParseException("Invalid caracter found: " + s.charAt(i), i);
            }
            curIsDigit = !curIsDigit;
        }
    }
}
