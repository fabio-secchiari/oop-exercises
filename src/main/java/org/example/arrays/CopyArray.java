package org.example.arrays;

import java.util.Arrays;

public class CopyArray {
    public static double[] copyArray(double[] v){
        return Arrays.copyOf(v, v.length);
    }
    public static int[] copyArray(int[] v){
        return Arrays.copyOf(v, v.length);
    }
    public static String[] copyArray(String[] v){return Arrays.copyOf(v, v.length);}

}
