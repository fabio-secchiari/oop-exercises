package org.example.collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {

    @Test
    void reverse() {
        List<String> str1 = new ArrayList<>(List.of("Hello", "World!"));
        List<String> str2 = new ArrayList<>(List.of("I", "am"));
        List<String> str3 = new ArrayList<>();
        Reverse.reverse(str1);
        Reverse.reverse(str2);
        Reverse.reverse(str3);
        assertEquals(List.of("World!", "Hello"), str1);
        assertEquals(List.of("am", "I"), str2);
        assertEquals(List.of(), str3);
    }
}