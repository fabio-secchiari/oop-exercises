package org.example.oop.basic;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
public class RationalNumber {
    private final int numerator;
    private final int denominator;

    public RationalNumber(int numerator, int denominator){
        int MCD = greatestCommonDivisor(numerator, denominator);
        this.numerator = numerator / MCD;
        this.denominator = denominator / MCD;
    }

    public RationalNumber add(RationalNumber o){
        int n_d = leastCommonMultiple(this.denominator, o.denominator);
        int n_n = ( n_d / this.denominator ) * this.numerator + ( n_d / o.denominator ) * o.numerator;
        return new RationalNumber(n_n, n_d);
    }

    public RationalNumber multiply(RationalNumber o){
        int n_n = o.numerator * this.numerator;
        int n_d = o.denominator * this.denominator;
        int MCD = greatestCommonDivisor(n_n, n_d);
        return new RationalNumber(n_n / MCD, n_d / MCD);
    }

    public static int greatestCommonDivisor(int a, int b) {
        int max = Math.max(Math.abs(a), Math.abs(b));
        int min = Math.min(Math.abs(a), Math.abs(b));

        int rest = max % min;
        if (max % min == 0) {
            return min;
        } else {
            return greatestCommonDivisor(min, rest);
        }
    }

    public static int leastCommonMultiple(int a, int b) {
        return Math.abs(a * b) / greatestCommonDivisor(a, b);
    }
}
