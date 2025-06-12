package org.example.collections;

import java.util.*;
import java.util.stream.Collectors;

public class WordFrequencySorted {
    public static Map<String, Integer> mostFrequent(Map<String, Integer> map, int limit){
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((e1, e2) -> e2.getValue() - e1.getValue());
        return new LinkedHashMap<>(list.stream().limit(limit)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));
    }
    public static Map<String, Integer> lessFrequent(Map<String, Integer> map, int limit){
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Comparator.comparingInt(Map.Entry::getValue));
        return new LinkedHashMap<>(list.stream().limit(limit)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));
    }
}
