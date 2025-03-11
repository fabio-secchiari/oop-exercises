package org.example.arrays;

public class Splitter{
    public static int[] splitter(int input){
        int[] num = new int[String.valueOf(input).length()];
        int i = num.length-1;
        while(input != 0){
            num[i--] = input % 10;
            input /= 10;
        }
        return num;
    }
}
