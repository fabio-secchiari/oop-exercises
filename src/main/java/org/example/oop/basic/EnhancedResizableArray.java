package org.example.oop.basic;

import java.util.Arrays;

public class EnhancedResizableArray {
    public static final int DEFAULT_CAPACITY = 4;
    private int[] v;

    public EnhancedResizableArray(){
        this.v = new int[DEFAULT_CAPACITY];
    }

    public int get(int index){
        return v[index];
    }

    void set(int index, int value){
        if (index >= v.length) {
            int[] tmp = new int[index * 2];
            System.arraycopy(v, 0, tmp, 0, v.length);
            v = tmp;
        }
        v[index] = value;
    }

    boolean contains(int value){
        for(int i: v){
            if(i == value) return true;
        }
        return false;
    }

    void fill(int value){
        Arrays.fill(v, value);
    }

    int[] toArray(){
        return Arrays.copyOf(v, v.length);
    }

    int length(){
        return v.length;
    }
}
