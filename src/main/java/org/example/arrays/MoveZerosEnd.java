package org.example.arrays;

public class MoveZerosEnd {
    public static int[] moveZerosEnd(int[] v){
        int[] nv = new int[v.length];
        int last_av = v.length-1, first_av=0;
        int i=0;
        while(first_av <= last_av){
            if(v[i] == 0){
                nv[last_av--] = 0;
            } else {
                nv[first_av++] = v[i];
            }
            i++;
        }
        return nv;
    }
}
