package org.example.arrays;

public class IsEveryWhere {
    public static boolean isEveryWhere(int[] v, int value){
        for(int i=0; i<v.length; i++){
            if(i+1 <= v.length-1){
                if(v[i+1] != value && v[i] != value){
                    return false;
                }
            }
        }
        return true;
    }
}
