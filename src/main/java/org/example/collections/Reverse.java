package org.example.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class Reverse {
    public static void reverse(List<String> sentence){
        Deque<String> stack = new ArrayDeque<>();
        for(String word : sentence){
            stack.push(word);
        }
        sentence.replaceAll(ignored -> stack.poll());
    }
}
