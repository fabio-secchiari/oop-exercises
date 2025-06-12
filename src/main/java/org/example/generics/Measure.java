package org.example.generics;

public class Measure {
    public interface Measurer <T> {
        double measure(T object);
    }

    public static <T> T max(T[] array, Measurer<T> measurer){
        double max = Double.MIN_VALUE;
        T maxObj = null;
        for(T obj : array){
            double temp = measurer.measure(obj);
            if(temp > max){
                max = temp;
                maxObj = obj;
            }
        }
        return maxObj;
    }

    public static <T> T min(T[] array, Measurer<T> measurer){
        double min = Double.MAX_VALUE;
        T minObj = null;
        for(T obj : array){
            double temp = measurer.measure(obj);
            if(temp < min){
                min = temp;
                minObj = obj;
            }
        }
        return minObj;
    }
}
