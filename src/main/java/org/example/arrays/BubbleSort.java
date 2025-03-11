package org.example.arrays;

public class BubbleSort {
    public static void bubbleSort(int[] v){
        int ns=1;
        while(ns > 0){
            ns=0;
            for(int i=0; i<v.length; i++){
                if(i > 0){
                    if(v[i-1] > v[i]){
                        int aux = v[i];
                        v[i] = v[i-1];
                        v[i-1] = aux;
                        ns++;
                    }
                }
            }
        }
    }
    public static int[] bubbleSortCopy(int[] v){
        int[] vcopy = CopyArray.copyArray(v);
        int ns=1;
        while(ns > 0){
            ns=0;
            for(int i=0; i<vcopy.length; i++){
                if(i > 0){
                    if(vcopy[i-1] > vcopy[i]){
                        int aux = vcopy[i];
                        vcopy[i] = vcopy[i-1];
                        vcopy[i-1] = aux;
                        ns++;
                    }
                }
            }
        }
        return vcopy;
    }
}
