package org.example.collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionTest {
    Set<Integer> set1;
    Set<Integer> set2;
    Set<Integer> set3;

    @BeforeEach
    void init(){
        set1 = Set.of(1,2,3);
        set2 = Set.of(4,5,6);
        set3 = Set.of(3,4,5);
    }

    @Test
    void intersection() {
        assertEquals(Set.of(), Intersection.intersection(set1, set2));
        assertEquals(Set.of(3), Intersection.intersection(set1, set3));
        assertEquals(Set.of(), Intersection.intersection(Set.of(), Set.of()));
    }

    @Test
    void intersectionRetainAll() {
        assertEquals(Set.of(), Intersection.intersectionRetainAll(set1, set2));
        assertEquals(Set.of(3), Intersection.intersectionRetainAll(set1, set3));
        assertEquals(Set.of(), Intersection.intersectionRetainAll(Set.of(), Set.of()));
    }
}