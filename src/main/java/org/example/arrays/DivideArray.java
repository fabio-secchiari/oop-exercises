package org.example.arrays;

public class DivideArray {
    public static double[] divideArray(double[] v, double factor){
        if(factor == 0) return CopyArray.copyArray(v);
        for(int i=0; i<v.length; i++){
            v[i] /= factor;
        }
        return CopyArray.copyArray(v);
    }
}
