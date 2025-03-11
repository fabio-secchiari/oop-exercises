package org.example.arrays;

public class FizzBuzz {
    public static String[] fizzBuzz(int start, int end){
        if(start < 0 || end < 0 || start >= end) return new String[0];
        String[] str = new String[end-start];
        int idx=0;
        for(int i=start; i<end; i++){
            if(i%3 == 0 && i%5 == 0) str[idx] = "FizzBuzz";
            else if(i%3 == 0) str[idx] = "Fizz";
            else if(i%5 == 0) str[idx] = "Buzz";
            else str[idx] = String.valueOf(i);
            idx++;
        }
        return str;
    }
}
