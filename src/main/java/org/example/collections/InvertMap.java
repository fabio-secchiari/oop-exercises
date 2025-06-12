package org.example.collections;

import java.util.HashMap;
import java.util.Map;

public class InvertMap {
    public static Map<String, Integer> invertMap(Map<Integer, String> src){
        Map<String, Integer> result = new HashMap<>();
        for(Integer key : src.keySet()){
            result.putIfAbsent(src.get(key), key);
        }
        return result;
    }
}
