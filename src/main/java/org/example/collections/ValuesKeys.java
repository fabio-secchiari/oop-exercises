package org.example.collections;

import java.util.Map;

public class ValuesKeys {
    public static boolean valuesKeys(Map<String, String> map){
        return map.keySet().stream().anyMatch(map::containsValue);
        /*Set<String> intersection = new HashSet<>(map.keySet());
        intersection.retainAll(new HashSet<>(map.values()));
        return !intersection.isEmpty();*/
    }
}
