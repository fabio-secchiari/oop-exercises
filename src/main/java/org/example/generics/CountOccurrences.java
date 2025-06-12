package org.example.generics;

import java.util.Objects;

public class CountOccurrences {
    public static <T> int countOccurrencesPlain(T[] src, T item){
        int count = 0;
        if(item == null){
            for (T obj : src) {
                if (obj == null) count++;
            }
        } else {
            for (T obj : src) {
                if (item.equals(obj)) count++;
            }
        }
        return count;
    }

    public static <T> int countOccurrencesObjects(T[] src, T item){
        int count = 0;
        for (T obj : src) {
            if (Objects.equals(obj, item)) count++;
        }
        return count;
    }
}
