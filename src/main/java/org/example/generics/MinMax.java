package org.example.generics;

import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static <T> T max(List<T> list, Comparator<? super T> cmp){
        T max = list.getFirst();
        for(T el : list){
            if(cmp.compare(el, max) > 0){
                max = el;
            }
        }
        return max;
    }

    public static <T> T min(List<T> list, Comparator<? super T> cmp){
        T min = list.getFirst();
        for(T el : list){
            if(cmp.compare(el, min) < 0){
                min = el;
            }
        }
        return min;
    }
}
