package org.example.arrays;

public class CanBalance {
    public static boolean canBalance(int[] v){
        int sum1=0, sum2=0;
        for (int i : v) sum1 += i;
        for(int i=v.length-1; i>=0; i--){
            sum1 -= v[i];
            sum2 += v[i];
            if(sum1 == sum2) return true;
        }
        return false;
    }
}
