package org.example.oop.polynomials;

public interface Poly {
    double coefficient(int grade);
    double[] coefficients();
    int degree();
    Poly derivative();
}
