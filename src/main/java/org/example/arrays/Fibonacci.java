package org.example.arrays;

public class Fibonacci {
    public static long[] fibonacci(int n){
        long[] arr = new long[n];
        for(int i=0; i<n; i++){
            if(i==0) arr[i] = 0;
            if(i==1) arr[i] = 1;
            if(i>1) arr[i] = arr[i-1] + arr[i-2];
        }
        return arr;
    }
}
