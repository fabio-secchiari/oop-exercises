package org.example.arrays;

public class DeepCopy {
    public static int[][] deepCopy(int[][] original){
        int[][] nv = new int[original.length][];
        for(int i=0; i<original.length; i++){
            nv[i] = CopyArray.copyArray(original[i]);
        }
        return nv;
    }
}
