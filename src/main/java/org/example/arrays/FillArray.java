package org.example.arrays;

import java.util.random.RandomGenerator;

public class FillArray {
    public static double[] fillArray(int size, double value, boolean addNoise){
        RandomGenerator rnd = RandomGenerator.getDefault();
        double[] retArr = new double[size];
        for(int i=0; i<size; i++){
            retArr[i] = value;
            if(addNoise){
                if(rnd.nextInt(2) == 0){
                    retArr[i] += value * 0.05;
                }else{
                    retArr[i] -= value * 0.05;
                }
            }
        }
        return retArr;
    }
}
