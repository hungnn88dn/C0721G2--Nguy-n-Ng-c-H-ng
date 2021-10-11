package _22_structural_design_pattern_java.practice.proxy;

import _22_structural_design_pattern_java.practice.proxy.Calculator;

public class MathCalculator implements Calculator {

    @Override
    public double add(double first, double second) {
        return first + second;
    }

    @Override
    public double sub(double first, double second) {
        return first - second;
    }

    @Override
    public double mul(double first, double second) {
        return first * second;
    }

    @Override
    public double div(double first, double second) {
        return first / second;
    }
}
