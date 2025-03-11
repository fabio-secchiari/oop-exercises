package org.example.arrays;

public class DivideArrays {
    public static double[] divideArrays(double[] v1, double[] v2){
        if(v1.length != v2.length) return new double[0];
        double[] newArr = CopyArray.copyArray(v1);
        for(int i=0; i<v1.length; i++){
            newArr[i] /= v2[i];
        }
        return newArr;
    }
}
