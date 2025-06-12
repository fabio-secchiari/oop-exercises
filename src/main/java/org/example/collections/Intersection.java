package org.example.collections;

import java.util.HashSet;
import java.util.Set;

public class Intersection {
    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second){
        Set<Integer> intersection = new HashSet<>(first);
        intersection.removeIf(num -> !second.contains(num));
        return intersection;
    }
    public static Set<Integer> intersectionRetainAll(Set<Integer> first, Set<Integer> second){
        Set<Integer> intersection = new HashSet<>(first);
        intersection.retainAll(second);
        return intersection;
    }
}
