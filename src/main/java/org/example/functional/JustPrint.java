package org.example.functional;

import java.util.List;
import java.util.Map;

public class JustPrint {
    public static <T> void justPrintList(List<T> list){
        list.forEach(el -> System.out.printf("Hello %s!%n", el.toString()));
    }

    public static <K,V> void justPrintMap(Map<K, V> map){
        map.forEach((el, val) -> System.out.printf("k:%s, v:%s%n", el.toString(), val.toString()));
    }
}
