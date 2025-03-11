package org.example.arrays;

public class MatchUp {
    public static int matchUp(int[] v1, int[] v2){
        if(v1.length != v2.length) return -1;
        int count=0;
        for(int i=0; i<v1.length; i++){
            if(Math.abs(v2[i] - v1[i]) <= 2 && v1[i] != v2[i]){
                count++;
            }
        }
        return count;
    }
}
