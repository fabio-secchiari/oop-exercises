package org.example.collections;

import java.util.HashSet;
import java.util.Set;

public class Union {
    public static Set<Integer> union(Set<Integer> first, Set<Integer> second){
        Set<Integer> union = new HashSet<>(first);
        for(Integer num : second){
            union.add(num);
        }
        return union;
    }
    public static Set<Integer> unionAddAll(Set<Integer> first, Set<Integer> second){
        Set<Integer> union = new HashSet<>(first);
        union.addAll(second);
        return union;
    }
}
