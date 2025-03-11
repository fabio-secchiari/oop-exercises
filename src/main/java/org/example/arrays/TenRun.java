package org.example.arrays;

public class TenRun {
    public static int[] tenRun(int[] v){
        int hold = -1;
        int[] nv = new int[v.length];
        for(int i=0; i<v.length; i++){
            if(v[i]%10 == 0) {
                hold = v[i];
            }
            nv[i] = hold > 0 ? hold : v[i];
        }
        return nv;
    }
}
