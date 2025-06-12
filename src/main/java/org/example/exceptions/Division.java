package org.example.exceptions;

public class Division {
    public static double division(double a, double b){
        if(b == 0) throw new IllegalArgumentException("Cannot divide by 0");
        return a/b;
    }
}
