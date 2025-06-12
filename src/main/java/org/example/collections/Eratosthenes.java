package org.example.collections;

import java.util.HashSet;
import java.util.Set;

public class Eratosthenes {
    public static Set<Integer> eratosthenes(int n){
        Set<Integer> primes = new HashSet<>();
        for(int i=2; i<=n; i++) primes.add(i);
        int divisor = 2;
        while(divisor <= Math.sqrt(n)){
            int finalDivisor = divisor;
            primes.removeIf(num -> num != finalDivisor && num % finalDivisor == 0);
            divisor++;
        }
        return primes;
    }
}
