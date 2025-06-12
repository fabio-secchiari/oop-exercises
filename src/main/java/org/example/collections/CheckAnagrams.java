package org.example.collections;

import java.util.HashMap;

public class CheckAnagrams {
    public static boolean areAnagrams(String first, String second){
        HashMap<Character, Integer> firstMap = new HashMap<>();
        HashMap<Character, Integer> secondMap = new HashMap<>();
        for(char c : first.toLowerCase().toCharArray()){
            firstMap.put(c, firstMap.getOrDefault(c, 0) + 1);
        }
        for(char c : second.toLowerCase().toCharArray()){
            secondMap.put(c, secondMap.getOrDefault(c, 0) + 1);
        }
        return firstMap.equals(secondMap);
    }
}
