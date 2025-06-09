package org.example.oop.polynomials;

import java.util.ArrayList;
import java.util.Arrays;

public class ListPoly extends AbstractPoly {
    private final ArrayList<Double> coefficients;

    public ListPoly(double[] coefficients) {
        this.coefficients = new ArrayList<>();
        for (double c : coefficients) {
            this.coefficients.add(c);
        }
    }

    @Override
    public double coefficient(int grade) {
        return coefficients.get(grade);
    }

    @Override
    public double[] coefficients() {
        double[] ret = new double[coefficients.size()];
        for(int i=0; i<ret.length; i++){
            ret[i] = coefficients.get(i);
        }
        return Arrays.copyOf(ret, ret.length);
    }

    @Override
    public int degree() {
        return coefficients.size() - 1;
    }

    @Override
    public Poly derivative() {
        return new ListPoly(derive());
    }
}
