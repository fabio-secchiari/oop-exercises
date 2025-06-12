package org.example.collections;

import java.util.Map;

public class RomanToDecimal {
    private static Map<Character, Integer> conversionMap() {
        return Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );
    }

    public static int romanToDecimal(String s){
        int decimal = 0;
        Map<Character, Integer> conversMap = conversionMap();
        for(int i=0; i<s.length(); i++){
            if(i > 0){
                if(conversMap.get(s.charAt(i-1)) < conversMap.get(s.charAt(i))){
                    decimal -= conversMap.get(s.charAt(i-1));
                } else {
                    decimal += conversMap.get(s.charAt(i-1));
                }
            }
        }
        decimal += conversMap.get(s.charAt(s.length()-1));
        return decimal;
    }
}
